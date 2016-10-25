package pl.student.mgorecki.controllers;

import java.util.Map;

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

import pl.student.mgorecki.domain.Address;
import pl.student.mgorecki.service.AddressService;

@Controller
@SessionAttributes

public class AddressController {
	@Autowired
	AddressService addressService;

	@RequestMapping(value = "/address")
	public String listAddress(Map<String, Object> map, HttpServletRequest request) {

		int addressId = ServletRequestUtils.getIntParameter(request, "addressId", -1);

		if (addressId > 0) {
			map.put("address", addressService.getAddress(addressId));
		} else {
			map.put("address", new Address());
		}

		map.put("addressList", addressService.listAddress());

		return "address";
	}

	@RequestMapping(value = "/addAddress", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("address") Address address, BindingResult result) {

		if (address.getId() == 0) {
			addressService.addAddress(address);
		} else {
			addressService.editAddress(address);
		}

		/*System.out.println("First name: " + address.getFirstname() + ", last name: " + address.getLastname() + ", email: "
				+ .getEmail() + ", telephone: " + address.getTelephone());*/

		return "redirect:address.html";
	}

	@RequestMapping("/delete/{addressId}")
	public String deleteAddress(@PathVariable("addressId") Integer addressId) {
		addressService.removeAddress(addressId);
		return "redirect:/address.html";
	}
}
