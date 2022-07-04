package com.willyslchen15.springboottraining;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HpPrinter implements Printer {

    @Value("${printer.name}")
    private String name;

    @Value("${printer.count:50}")
    private int count;

/*    @PostConstruct
    public void init() {
        count = 10;
    }*/

    @Override
    public void print(String message) {
        count--;
        System.out.println(name + " : " + message);
        System.out.println("Count : " + count);
    }
}
