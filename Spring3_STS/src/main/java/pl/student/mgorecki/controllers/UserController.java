package pl.student.mgorecki.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import pl.student.mgorecki.domain.User;

@Controller
@SessionAttributes
public class UserController {

	@RequestMapping(value = "/addUser", method=RequestMethod.POST)
	public String addContact(@ModelAttribute("user") User user, BindingResult result){
		System.out.println("First name: "+user.getFirstName()+", last name: "+user.getLastName()+", email: "+user.getEmail()+", telephone: "+user.getTelephone());
		
		return "redirect:users.html";
	}
	
	@RequestMapping("/users")
	public ModelAndView showContacts() {
		return new  ModelAndView("user","command",new User());
	}
}
