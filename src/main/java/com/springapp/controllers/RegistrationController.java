package com.springapp.controllers;

import com.springapp.DAO.impl.MySqlImpl;
import com.springapp.login.LoginForm;
import com.springapp.login.User;
import com.springapp.validator.RegFormValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/reg")
public class RegistrationController {
    @Autowired
    private RegFormValidator validator;

    @Autowired
    private MySqlImpl mySql;

    @RequestMapping("/")
    public String showReg(HttpSession session, Model model){
        model.addAttribute("user", new User());
        return "register";
    }

    @RequestMapping("/do.reg")
    public String register(User user, BindingResult result, Model model){
        validator.validate(user, result);
        if (result.hasErrors()) {
            return "register";
        }
        mySql.
        model.addAttribute("loginForm", new LoginForm());
        // TODO: 25.04.2017 make name insert with js 
//        model.addAttribute("name",user.getUsernameReg());
        return "login";
    }
}
