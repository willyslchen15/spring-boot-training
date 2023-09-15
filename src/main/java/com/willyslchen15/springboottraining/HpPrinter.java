package com.willyslchen15.springboottraining;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class HpPrinter implements Printer {
    private int count;

    @PostConstruct
    public void init() {
        count = 10;
    }

    @Override
    public void print(String message) {
        count--;
        System.out.println("Hp Printer : " + message);
        System.out.println("Count : " + count);
    }
}
