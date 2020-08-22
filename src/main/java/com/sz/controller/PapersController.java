package com.sz.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sz.admin.Da;
import com.sz.admin.ScorePage;
import com.sz.admin.Scores;
import com.sz.entity.*;
import com.sz.service.IScoreService;
import com.sz.service.IScoredataService;
import com.sz.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

@Controller
public class PapersController {

    @Autowired
    private ItemsService itemsService;


    @Autowired
    private IScoreService scoreService;

    @Autowired
    private IScoredataService scoredataService;

//    //跳转到试题页面
//    @RequestMapping("/papers")
//    public ModelAndView papers(int id, ModelAndView modelAndView){
//        modelAndView.setViewName("items");
//        modelAndView.addObject("id", id);
//        return modelAndView;
//    }

    //显示试题
    @RequestMapping("/admin/papers")
    public ModelAndView items(int id,ModelAndView modelAndView){
        List<Items> items = itemsService.randItems(id);
        modelAndView.setViewName("items");
        modelAndView.addObject("items",items);
        return modelAndView;
    }


//    //显示试卷,只负责跳转到页面
//    @RequestMapping("/admin/shijuan")
//    public String shijuan(int id){
//        return "shijuan";
//    }

    //显示试卷,负责跳转返会json数据
    @RequestMapping("/admin/shijuan")
    public ModelAndView shijuan2(int id,ModelAndView modelAndView,HttpServletRequest request) {
        Object user = request.getSession().getAttribute("user");
        List<Scores> li = null;
        if (user != null) {
            User u = (User) user;
            li=scoreService.selectByUserAll(new II(id,u.getUserid()));
        } else {
            li = null;
        }
        modelAndView.addObject("li", li);
        modelAndView.setViewName("shijuan");
        System.out.println(li);
        return modelAndView;
    }




    //提交试题
    @RequestMapping("/admin/score")
    @ResponseBody
    public String items2(@RequestBody String str,HttpServletRequest request){
        List<Da> das = JSONObject.parseArray(str, Da.class);
        int sum=0;

        /**
         * private int id;               用户id
         *     private int epaperid;     试卷id
         *     private String name;       成绩
         *     private int score;        答对
         *     private String value;    答错
         */

        User user = (User)request.getSession().getAttribute("user");
        if (user!=null){
            Score score=new Score();


            int yes=0,no=0;
            int num=0;
            for (Da d:das){
                if (d.getValue().equals(d.getName())){
                    yes+=1;
                    num=num+(d.getScore());
                }else {
                    no+=1;
                }
            }
            score.setPaperid(das.get(0).getEpaperid());
            score.setErrors(no);
            score.setPights(yes);
            score.setUserid(user.getUserid());
            score.setScore(num);
            sum=num;
            System.out.println(score);
            int i = scoreService.insertScore(score);


               //成绩id ,试题id，使用答案，实际得分

            for (Da d:das){
                Scoredata scoredata=new Scoredata();
                scoredata.setScoreid(i);
                scoredata.setEid(d.getId());
                scoredata.setUanswer(d.getName());
                if (d.getValue().equals(d.getName())){
                    scoredata.setUpoint(d.getScore());
                } else {
                    scoredata.setUpoint(0);
                }
                scoredataService.ByInsertList(scoredata);
            }

        }else {

        }
        return sum+"";
    }

    //成绩单详情
    @RequestMapping("/admin/scoredata")
    public ModelAndView scoredata(int id,ModelAndView modelAndView){  //成绩表id
        List<ScorePage> scorePages = scoreService.selectByScorePage(id);
        modelAndView.setViewName("scorepage");
        modelAndView.addObject("li",scorePages);
        return modelAndView;
    }




}
