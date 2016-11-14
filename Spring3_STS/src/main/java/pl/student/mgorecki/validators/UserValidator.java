package pl.student.mgorecki.validators;

import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import pl.student.mgorecki.domain.User;

public class UserValidator implements Validator {
	private int minPasswordLength;
	private int maxPasswordLength;
	private static String loginRegex = "[a-zA-Z]*";
	private static String digitsRegex = ".*\\p{Digit}.*";
	private static String specialCharactersRegex = ".*[!£$#%^&*@?<>+_].*";

	EmailValidator emailValidator = EmailValidator.getInstance();

	@Override
	public boolean supports(Class clazz) {
		return User.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub
	}

	public void validate(User user, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "firstname", "error.field.required");
		ValidationUtils.rejectIfEmpty(errors, "lastname", "error.field.required");
		ValidationUtils.rejectIfEmpty(errors, "telephone", "error.field.required");
		ValidationUtils.rejectIfEmpty(errors, "email", "error.field.required");

		if (errors.getErrorCount() == 0) {
			if (StringUtils.hasText(user.getEmail()) && emailValidator.isValid(user.getEmail()) == false) {
				errors.rejectValue("email", "error.email.invalid");
			}
		}
	}

	public void setMinPasswordLength(int minPasswordLength) {
		this.minPasswordLength = minPasswordLength;
	}

	public void setMaxPasswordLength(int maxPasswordLength) {
		this.maxPasswordLength = maxPasswordLength;
	}
}
