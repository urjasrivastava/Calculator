package com.calculator.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
class CalculatorController
{
    @Autowired
    private Calculator calculator;
    @RequestMapping("/pow")
    String pow(@RequestParam("a") Integer a,@RequestParam("b") Integer b)
    {
        return String.valueOf(calculator.pow(a,b));
    }
}