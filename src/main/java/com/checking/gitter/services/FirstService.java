package com.checking.gitter.services;

import org.springframework.stereotype.Service;


@Service
public class FirstService
{
    public void someMethod()
    {
        System.out.println("This is some method");
    }


    public String firstMethod(int a)
    {
        return new String(String.valueOf(a));
    }
}
