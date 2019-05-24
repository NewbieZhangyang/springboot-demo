package com.newbie.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringbootDemoApplication extends SpringBootServletInitializer {

    /**
     * 修改启动类，在外部的tomcat中部署时使用
     * 参考资源：https://www.cnblogs.com/qianzf/p/8405479.html
     * @param builder
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootDemoApplication.class);
    }

    /**
     * 使用内部的tomcat时，默认的启动类
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }

}
