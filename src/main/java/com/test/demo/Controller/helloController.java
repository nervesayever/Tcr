package com.test.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/sh")
    public String shit(){
        return "sh";
    }
}
