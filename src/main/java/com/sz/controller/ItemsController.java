package com.sz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ItemsController {


    //成绩提交后

    @RequestMapping("/xx")
    public ModelAndView item(@RequestParam(name = "a") String a, ModelAndView modelAndView){
        System.out.println(a);
        modelAndView.setViewName("score");
        modelAndView.addObject("score", a);
        return modelAndView;
    }

}
