package com.willyslchen15.springboottraining;

import org.springframework.stereotype.Component;

@Component
public class HpPrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println("Hp Printer : " + message);
    }
}
