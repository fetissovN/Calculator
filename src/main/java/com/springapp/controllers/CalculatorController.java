package com.springapp.controllers;

import com.springapp.entity.Form;
import com.springapp.logic.impl.CalcImplDivide;
import com.springapp.logic.impl.CalcImplMinus;
import com.springapp.logic.impl.CalcImplMultiply;
import com.springapp.logic.impl.CalcImplPlus;
import com.springapp.validator.MainPageValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/calc")
public class CalculatorController {
    @Autowired
    private MainPageValidator validator;

    @Resource(name = "calcImplPlus")
    private CalcImplPlus calcImplPlus;

    @Resource(name = "calcImplMinus")
    private CalcImplMinus calcImplMinus;

    @Resource(name = "calcImplMultiply")
    private CalcImplMultiply calcImplMultiply;

    @Resource(name = "calcImplDivide")
    private CalcImplDivide calcImplDivide;


    @RequestMapping("/")
    public String showCalc(Model model, HttpSession session){
        if (session.getAttribute("auth")==null){
            return "redirect:/";
        }
        model.addAttribute("user", session.getAttribute("auth"));
        model.addAttribute("form", new Form());
        return "hello";
    }

    @RequestMapping(value = "/count", params = "plus")
    public String plus(Form form, BindingResult result, Model model){
        validator.validate(form, result);
        if (result.hasErrors()){
            return "hello";
        }
        double t = calcImplPlus.calculate(form.getA(),form.getB());
        model.addAttribute("res", t);
        return "hello";
    }

    @RequestMapping(value = "/count",params = "minus")
    public String minus(Form form, Model model, BindingResult result){
        validator.validate(form, result);
        if (result.hasErrors()){
            return "hello";
        }
        double t = calcImplMinus.calculate(form.getA(),form.getB());
        model.addAttribute("res", t);
        System.out.println(t);
        return "hello";
    }
    @RequestMapping(value = "/count",params = "mult")
    public String multiply(Form form, Model model, BindingResult result){
        validator.validate(form, result);
        if (result.hasErrors()){
            return "hello";
        }
        double t = calcImplMultiply.calculate(form.getA(),form.getB());
        model.addAttribute("res", t);
        return "hello";
    }
    @RequestMapping(value = "/count",params = "divide")
    public String divide(Form form, Model model,BindingResult result){
        validator.validate(form, result);
        if (result.hasErrors()){
            return "hello";
        }
        double t = calcImplDivide.calculate(form.getA(),form.getB());
        model.addAttribute("res", t);
        System.out.println(t);
        return "hello";
    }

    @RequestMapping("/{id1}/{id2}")
    public String test(Model model, @PathVariable("id1") int id1, @PathVariable("id2") int id2){
        int t  = id1+id2;
        model.addAttribute("res", t);
        return "hello";
    }

//    public


}
