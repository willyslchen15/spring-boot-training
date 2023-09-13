package com.willyslchen15.springboottraining;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    private Printer printer;

    @RequestMapping("/test")
    public String test() {
        printer.print("Hello Spring!!!");
        return "Hello World";
    }
}
