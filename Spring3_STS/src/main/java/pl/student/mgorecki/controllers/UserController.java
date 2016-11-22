package pl.student.mgorecki.controllers;

import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import pl.student.mgorecki.domain.UserRole;
import pl.student.mgorecki.domain.User;
import pl.student.mgorecki.service.AddressService;
import pl.student.mgorecki.service.PeselService;
import pl.student.mgorecki.service.UserService;
import pl.student.mgorecki.validators.UserValidator;

@Controller
@SessionAttributes

public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
	PeselService peselService;
	
	@Autowired
	AddressService addressService;

	UserValidator userValidator = new UserValidator();

	@RequestMapping(value = "/users")
	public String listUsers(Map<String, Object> map, HttpServletRequest request) {

		int userId = ServletRequestUtils.getIntParameter(request, "userId", -1);

		if (userId > 0) {
			User user = userService.getUser(userId);
			user.setPassword("");
			user.setAddress(addressService.getAddress(userService.getUser(userId).getAddress().getId()));
			map.put("selectedAddress",userService.getUser(userId).getAddress().getId());
			map.put("user", user);
			
		} else {
			map.put("user", new User());
		}
		
		map.put("userRoleList",userService.listUserRole());
		map.put("addressesList", addressService.listAddress());
		map.put("userList", userService.listUser());

		return "user";
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("user") User user, BindingResult result, HttpServletRequest request,
			Map<String, Object> map) {

		userValidator.validate(user, result);
		
		if (result.getErrorCount() == 0) {
			if (user.getId()==0)
			   {
				   if (user.getPesel().getId() == 0)
					   peselService.addPesel(user.getPesel());
				   if (user.getAddress().getId() > 0)
					   user.setAddress(addressService.getAddress(user.getAddress().getId()));
				   userService.addUser(user);
			   }
				
			 else {
				peselService.editPesel(user.getPesel());
				userService.editUser(user);
			}
			System.out.println("First name: " + user.getFirstname() + ", last name: " + user.getLastname() + ", email: "
					+ user.getEmail() + ", telephone: " + user.getTelephone());

			return "redirect:users.html";
		}else{
			
			map.put("userRoleList",userService.listUserRole());
			map.put("addressesList", addressService.listAddress());
			map.put("userList", userService.listUser());
			return "user";
		}
		
	}

	@RequestMapping("/delete/{userId}")
	public String deleteUser(@PathVariable("userId") Integer userId) {
		userService.removeUser(userId);
		return "redirect:/users.html";
	}

	@RequestMapping("/userRole")
	public ModelAndView showUserRole() {

		return new ModelAndView("userRole", "userRole", new UserRole());
	}

	@RequestMapping(value = "/addUserRole", method = RequestMethod.POST)
	public String addUserRole(@ModelAttribute("userRole") UserRole userRole, BindingResult result,
			HttpServletRequest request, Map<String, Object> map) {

		userService.addUserRole(userRole);

		return "redirect:users.html";
	}

}
