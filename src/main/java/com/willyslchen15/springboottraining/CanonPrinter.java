package com.willyslchen15.springboottraining;

import org.springframework.stereotype.Component;

@Component
public class CanonPrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println("Canon Printer : " + message);
    }
}
