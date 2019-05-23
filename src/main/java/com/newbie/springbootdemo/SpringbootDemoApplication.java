package com.newbie.springbootdemo;

import com.newbie.springbootdemo.domain.ConfigHome;
import com.newbie.springbootdemo.domain.ConfigNewbie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ConfigNewbie.class, ConfigHome.class})
public class SpringbootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }

}
