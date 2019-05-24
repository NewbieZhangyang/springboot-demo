package com.newbie.springbootdemo.controller;

import com.newbie.springbootdemo.domain.LearnResouce;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用RESTful风格，开发Web接口
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    /**
     * 导航到index.html页面
     * @return
     */
    @RequestMapping("")
    public ModelAndView handerIndex(){
        System.out.println("跳转到index.html页面");
        List<LearnResouce> learnList =new ArrayList<LearnResouce>();
        LearnResouce bean =new LearnResouce();
        bean.setAuthor("简小六");
        bean.setTitle("使用RESTful风格，开发Web接口");
        bean.setUrl("https://www.cnblogs.com/newbie27/p/10914620.html");
        learnList.add(bean);
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("learnList",learnList);
        return modelAndView;
    }

    /**
     * 使用RESTful风格，开发Web接口
     * @return
     */
    @RequestMapping(value = "/restful",method = RequestMethod.GET)
    @ResponseBody
    public String restfulGet(){
        return "restful风格：get()";
    }

    @RequestMapping(value = "/restful/{id}",method = RequestMethod.GET)
    @ResponseBody
    public String restfulGet(@PathVariable String id){
        return "restful风格：get(String id) : id = "+id;
    }

    @RequestMapping(value = "/restful/{id}",method = RequestMethod.POST)
    @ResponseBody
    public String restfulPost(@PathVariable String id){
        return "restful风格: post(String id) : id = "+id;
    }

    @RequestMapping(value = "/restful/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public String restfulDelete(@PathVariable String id){
        return "restful风格: delete((String id) : id = "+id;
    }
}
