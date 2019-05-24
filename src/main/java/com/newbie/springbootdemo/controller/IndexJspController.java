package com.newbie.springbootdemo.controller;

import com.newbie.springbootdemo.domain.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/jsp")
public class IndexJspController {

    @Autowired
    ResponseResult responseResult;


    /**
     * 导航到index.html页面
     * @return
     */
    @RequestMapping("/showInfo")
    public ModelAndView handerIndex(){
        responseResult.setCode("success");
        responseResult.setMessage("成功访问jsp页面");
        ModelAndView modelAndView = new ModelAndView("showInfo");
        modelAndView.addObject("data",responseResult);
        return modelAndView;
    }
}
