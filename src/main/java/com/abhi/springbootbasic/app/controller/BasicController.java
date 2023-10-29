package com.abhi.springbootbasic.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World";
    }
}
