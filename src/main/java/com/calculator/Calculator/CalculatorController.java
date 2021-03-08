package com.calculator.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
class CalculatorController
{
    @Autowired
    private Calculator calculator;
    @RequestMapping(value="/pow", method= RequestMethod.GET)
    public String pow(@RequestParam("a") Integer a, @RequestParam("b") Integer b,Model model)
    {
        String display=String.format("pow(%d,%d)",a,b);
        model.addAttribute("tag",String.valueOf(display));
        model.addAttribute("result",String.valueOf(calculator.pow(a,b)));
        return "answer";
    }
    @RequestMapping(value="/log", method= RequestMethod.GET)
    public String log(@RequestParam("a") Double a, Model model)
    {   String display=String.format("log(%f)",a);
        model.addAttribute("tag",String.valueOf(display));
        model.addAttribute("result",String.valueOf(calculator.log(a)));
        return "answer";
    }
    @RequestMapping(value="/sqrt", method= RequestMethod.GET)
    public String sqrt(@RequestParam("a") Double a,Model model)
    {   String display=String.format("sqrt(%f)",a);
        model.addAttribute("tag",String.valueOf(display));
        model.addAttribute("result",String.valueOf(calculator.sqrt(a)));
        return "answer";
    }
    @RequestMapping(value="/factorial", method= RequestMethod.GET)
    public String factorial(@RequestParam("a") Integer a,Model model)
    {   String display=String.format("factorial(%d)",a);
        model.addAttribute("tag",String.valueOf(display));
        model.addAttribute("result",String.valueOf(calculator.factorial(a)));
        return "answer";
    }
}