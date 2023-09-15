package com.willyslchen15.springboottraining;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class CanonPrinter implements Printer, InitializingBean {
    private int count;

    @Override
    public void afterPropertiesSet() throws Exception {
        count = 100;
    }

    @Override
    public void print(String message) {
        count--;
        System.out.println("Canon Printer : " + message);
        System.out.println("Count : " + count);
    }
}
