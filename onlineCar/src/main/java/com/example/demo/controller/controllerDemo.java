package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.jvm.hotspot.HelloWorld;

@RestController
public class controllerDemo {

    @RequestMapping("/Hello")
    public String HelloWorld(){
        return "Hello World";
    }

}
