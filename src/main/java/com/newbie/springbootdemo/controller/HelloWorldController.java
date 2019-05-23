package com.newbie.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("helloWorld")
    public String helloWorld(){
        System.out.println("HelloWorld Controller");
        return "Hello World.This is my first SpringBoot Project."  ;
    }



}
