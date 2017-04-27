package com.springapp.controllers;

import com.springapp.DAO.impl.MySqlImpl;
import com.springapp.login.LoginForm;
import com.springapp.login.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.security.mscapi.RSASignature;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class LoginController {

	@Autowired
	private MySqlImpl mySql;

//    @Autowired
//    private User user;

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
	    String email = loginForm.getUsername();
        String password = loginForm.getPassword();

        User user = mySql.getUserByMail(email);
	    if (user!=null){
	    	if (user.getPasswordReg().equals(password)){
                session.setAttribute("auth", new User(user.getId(), u));
                return "redirect:/calc/";
            }
        }
	    return "redirect:/";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("auth");
        return "redirect:/";
    }
}