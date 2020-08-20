package com.sz.controller;

import com.sz.entity.Items;
import com.sz.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.List;

@Controller
public class PapersController {

    @Autowired
    private ItemsService itemsService;

    //跳转到试题页面
    @RequestMapping("/papers")
    public ModelAndView papers(int id, ModelAndView modelAndView){
        modelAndView.setViewName("items");
        modelAndView.addObject("id", id);
        return modelAndView;
    }

    //显示试题
    @RequestMapping("/items")
    @ResponseBody
    public List<Items> items(int id){
        System.out.println(id);
        List<Items> items = itemsService.ByItemsAll(id);
        if (items==null){
            return null;
        }else {
            return items;
        }
    }


    //提交试题
    @RequestMapping("/items2")
    public String items2(){
        return "xx";
    }

}
