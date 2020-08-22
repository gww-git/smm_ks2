package com.sz.controller;

import com.sz.entity.User;
import com.sz.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class LoginControllere {


    @Autowired
    IUserService userService;


    //登录
    @RequestMapping("/login")
    public void login(@RequestParam("uname") String uname, String upwd, HttpServletRequest request, HttpServletResponse response){
        User user = userService.selectByUser(uname);
        String msg;
        boolean fa=false;
        if (user==null){
            try {
                request.setAttribute("msg", "1");
                request.getRequestDispatcher("/user.jsp").forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            if (!user.getUpwd().equals(upwd)){
                try {
                    request.setAttribute("msg", "2");
                    request.getRequestDispatcher("/user.jsp").forward(request,response);
                } catch (ServletException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else {
                try {
                    request.getSession().setAttribute("user", user);
                    response.sendRedirect("/admin.html");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    //注册
    @RequestMapping("/zhuce")
    @ResponseBody
    public void logup(String uname, String upwd,HttpServletResponse response,HttpServletRequest request){
        System.out.println(uname);
        System.out.println(upwd);
        User user = userService.selectByUser(uname);
        String msg="";
        if (user!=null){
            msg="0";
        }else {
            User user1=new User();
            user1.setUname(uname);
            user1.setUpwd(upwd);
            int i = userService.InsertUser(user1);
            if (i>0)
              msg="1";
            else
                msg="2";
        }
        request.setAttribute("msg", msg);
        try {
            request.getRequestDispatcher("/zhuce.jsp").forward(request,response );
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
