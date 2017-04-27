package com.springapp.controllers;

import com.springapp.login.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class LoginController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model, HttpSession session) {
		if (session.getAttribute("auth")==null){
            model.addAttribute("loginForm", new LoginForm());
            return "login";
		}
		return "redirect:/calc/";
	}

	@RequestMapping(value = "/login")
    public String login(@ModelAttribute("loginForm") LoginForm loginForm, HttpSession session){
	    String user = loginForm.getUsername();
        String password = loginForm.getPassword();

	    if (user.equals("admin")&& password.equals("admin")){
	        session.setAttribute("auth", loginForm);
	        return "redirect:/calc/";
        }
	    return "redirect:/";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("auth");
        return "redirect:/";
    }
}