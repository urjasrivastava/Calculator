package com.calculator.Calculator;
import org.springframework.stereotype.Service;

@Service
public class Calculator
{
    int pow(int a,int b)
    {
        return (int) Math.pow(a,b);
    }

    double sqrt(double a)
    {
        return Math.sqrt(a);
    }

    double log(double a)
    {
        return Math.log(a);
    }

    long factorial(int a)
    {
        if(a<0)
            return 0;
        if(a==0)
            return 1;
        long fact=1;
        for(int i=1;i<=a;i++)
            fact*=i;
        return fact;
    }
}

