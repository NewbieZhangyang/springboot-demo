package com.newbie.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("helloWorld")
    public String helloWorld() {
        String message = "Hello World Controller";
        System.out.println(message);
        return message;
    }


}
