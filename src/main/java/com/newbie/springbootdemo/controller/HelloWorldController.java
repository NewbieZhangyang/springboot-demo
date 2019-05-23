package com.newbie.springbootdemo.controller;

import com.newbie.springbootdemo.domain.ConfigHome;
import com.newbie.springbootdemo.domain.ConfigNewbie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Value("${com.newbie.name}")
    private String name;
    @Value("${com.newbie.hobby}")
    private String hobby;

    @Autowired
    private ConfigNewbie configNewbie;

    @Autowired
    private ConfigHome configHome;

    @RequestMapping("helloWorld")
    public String helloWorld(){
        System.out.println("HelloWorld Controller");
        String message = "name :"+this.name+" , hobby:"+this.hobby+" >>> ";
        message += "configNewbie.name : "+this.configNewbie.getName() + " , configNewbie.hoby : "+this.configNewbie.getHobby()+" >>> ";
        message += "home.address : "+configHome.getAddress()+" , home.type: "+configHome.getType()+",randomId : "+configHome.getRandomId()+" >>>";
        return  message;
    }



}
