package com.springapp.mvc;

import com.springapp.entity.Form;
import com.springapp.logic.Calc;
import com.springapp.logic.impl.CalcImplDivide;
import com.springapp.logic.impl.CalcImplMinus;
import com.springapp.logic.impl.CalcImplMultiply;
import com.springapp.logic.impl.CalcImplPlus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;

@Controller
@RequestMapping("/calc")
public class CalculatorController {

    @Resource(name = "calcImplPlus")
    private CalcImplPlus calcImplPlus;

    @Resource(name = "calcImplMinus")
    private CalcImplMinus calcImplMinus;

    @Resource(name = "calcImplMultiply")
    private CalcImplMultiply calcImplMultiply;

    @Resource(name = "calcImplDivide")
    private CalcImplDivide calcImplDivide;


    @RequestMapping("/")
    public String showCalc(Model model){
        model.addAttribute("MyForm", new Form(7,11));
        return "hello";
    }

    @RequestMapping(value = "/count", params = "plus")
    public String plus(@ModelAttribute("MyForm") Form form, Model model, HttpServletRequest request, HttpServletResponse response){

        double t = calcImplPlus.calculate(form.getA(),form.getB());
        model.addAttribute("res", t);
        return "hello";
    }

    @RequestMapping(value = "/count",params = "minus")
    public String minus(@ModelAttribute("MyForm") Form form, Model model, HttpServletRequest request, HttpServletResponse response){
        double t = calcImplMinus.calculate(form.getA(),form.getB());
        model.addAttribute("res", t);
        System.out.println(t);
        return "hello";
    }
    @RequestMapping(value = "/count",params = "mult")
    public String multiply(@ModelAttribute("MyForm") Form form, Model model, HttpServletRequest request, HttpServletResponse response){
        double t = calcImplMultiply.calculate(form.getA(),form.getB());
        model.addAttribute("res", t);
        System.out.println(t);
        return "hello";
    }
    @RequestMapping(value = "/count",params = "divide")
    public String divide(@ModelAttribute("MyForm") Form form, Model model, HttpServletRequest request, HttpServletResponse response){
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


}
