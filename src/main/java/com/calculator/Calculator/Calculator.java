package com.calculator.Calculator;
import org.springframework.stereotype.Service;

@Service
public class Calculator
{
    int pow(int a,int b)
    {
        return (int) Math.pow(a,b);
    }
}

