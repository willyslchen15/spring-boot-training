package com.willyslchen15.springboottraining;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class MyAspect {

    @Before("execution(* com.willyslchen15.springboottraining.HpPrinter.*(..))")
    public void before() {
        System.out.println("I'm before!");
        System.out.println("--------------------------------------------");
    }

    @After("execution(* com.willyslchen15.springboottraining.HpPrinter.*(..))")
    public void after() {
        System.out.println("--------------------------------------------");
        System.out.println("I'm after!");
    }

    @Around("execution(* com.willyslchen15.springboottraining.CanonPrinter.*(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Date start = new Date();
        System.out.println("============================================");

        Object obj = proceedingJoinPoint.proceed();

        System.out.println("============================================");
        Date end = new Date();
        long time = end.getTime() - start.getTime();
        System.out.println("Total time : " + time + " ms");

        return obj;
    }
}
