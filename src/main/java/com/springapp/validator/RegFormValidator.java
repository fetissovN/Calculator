package com.springapp.validator;


import com.springapp.entity.User;
import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class RegFormValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        User user = (User) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "usernameReg", "usernameReg.empty", "Username must not be empty.");
        String username = user.getUsernameReg();
        if (username.length() > 20){
            errors.rejectValue("usernameReg", "usernameReg.tooLong", "Username must not more than 20 characters.");
        }
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "passwordReg", "passwordReg.empty", "Password must not be empty.");
        if (!(user.getPasswordReg()).equals(user
                .getPasswordRegCheck())) {
            errors.rejectValue("passwordRegCheck", "passwordRegCheck.passwordDontMatch", "Passwords don't match.");
        }

        if( !EmailValidator.getInstance().isValid( user.getEmailReg() ) ){
            errors.rejectValue("emailReg", "emailReg.notValid", "Email address is not valid.");
        }
    }
}
