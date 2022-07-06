package com.willyslchen15.springboottraining;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/detail")
public class MyController {

    @RequestMapping("/product")
    public String product() {
        return "Apple, Orange";
    }

    @RequestMapping("/user")
    public String user() {
        return "Name : Willy";
    }
}
