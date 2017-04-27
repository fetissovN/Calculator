package com.springapp.validator;


import com.springapp.forms.Form;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class MainPageValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return Form.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Form form = (Form) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "a", "a.empty", "must not be empty");
        Pattern pattern = Pattern.compile("^[0-9]{1,5}$");
        Matcher matcher = pattern.matcher(String.valueOf(form.getA()));
        if (matcher.matches()==false){
            errors.rejectValue("a", "a.wrong", "choose the right digit");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "b", "b.empty", "must not be empty");
        Pattern pattern2 = Pattern.compile("^[0-9]{1,5}$");
        Matcher matcher2 = pattern2.matcher(String.valueOf(form.getB()));
        if (matcher2.matches()==false){
            errors.rejectValue("b", "b.wrong", "choose the right digit");
        }
    }
}
