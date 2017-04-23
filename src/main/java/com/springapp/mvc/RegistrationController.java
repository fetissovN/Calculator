package com.springapp.mvc;

import com.springapp.login.RegistrationForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/reg")
public class RegistrationController {
    @RequestMapping("/")
    public String showReg(HttpSession session, Model model){
        model.addAttribute("registrationForm", new RegistrationForm());
        return "register";
    }

    @RequestMapping("/do.reg")
    public String register(@ModelAttribute("registrationForm") RegistrationForm form, HttpSession session, Model model){

        model.addAttribute("registrationForm", new RegistrationForm());
        return "register";
    }
}
