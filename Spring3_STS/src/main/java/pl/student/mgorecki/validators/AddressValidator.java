package pl.student.mgorecki.validators;

import java.util.logging.Logger;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import pl.student.mgorecki.domain.Address;

public class AddressValidator implements Validator {
	private static String postalCodeRegex = "[0-9]{2}-[0-9]{3}";

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub

	}

	public void validate(Address address, Errors errors) {

		System.out.println("validating address....");
		ValidationUtils.rejectIfEmpty(errors, "city", "error.field.required");
		ValidationUtils.rejectIfEmpty(errors, "street", "error.field.required");
		ValidationUtils.rejectIfEmpty(errors, "postalCode", "error.field.required");
		ValidationUtils.rejectIfEmpty(errors, "buildingNumber", "error.field.required");
		
		if (errors.getErrorCount() == 0) {
			if (!validatePostalCode(address.getPostalCode())) {
				errors.rejectValue("postalCode", "error.postal.code");
			}
		}else{
			System.out.println("Errors occured");
		}
	}

	public boolean validatePostalCode(String postalCode) {

		return Pattern.matches(postalCodeRegex, postalCode);

	}

}
