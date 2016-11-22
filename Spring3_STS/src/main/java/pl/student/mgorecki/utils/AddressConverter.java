package pl.student.mgorecki.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import pl.student.mgorecki.domain.Address;
import pl.student.mgorecki.service.AddressService;

public class AddressConverter implements Converter<String, Address> {

	@Autowired
	AddressService addressService;
	
	@Override
	public Address convert(String source) {
		return addressService.getAddress(Integer.parseInt(source));
	}
}


