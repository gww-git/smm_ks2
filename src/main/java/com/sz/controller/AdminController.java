package com.sz.controller;

import com.sz.entity.Papers;
import com.sz.service.IPapersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private IPapersService papersService;

    @RequestMapping("/admin/data")
    @ResponseBody
    public List<Papers> admin(){

        return papersService.ByPapersAll();
    }

}
