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
        model.addAttribute("result",String.valueOf(calculator.pow(a,b)));
        return "answer";
    }
}