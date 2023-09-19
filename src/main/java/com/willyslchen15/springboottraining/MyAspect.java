package com.willyslchen15.springboottraining;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
    @Before("execution(* com.willyslchen15.springboottraining.HpPrinter.*(..))")
    public void before() {
        System.out.println("I'm before.");
    }

    @After("execution(* com.willyslchen15.springboottraining.HpPrinter.*(..))")
    public void after() {
        System.out.println("I'm after.");
    }
}
