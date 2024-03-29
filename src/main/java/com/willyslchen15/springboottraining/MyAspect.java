package com.willyslchen15.springboottraining;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

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

    @Around("execution(* com.willyslchen15.springboottraining.CanonPrinter.print(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Date start = new Date();

        // 執行切入點的方法
        Object obj = proceedingJoinPoint.proceed();

        Date end = new Date();
        long time = end.getTime() - start.getTime();
        System.out.println("Time : " + time + " ms");
        return obj;
    }
}
