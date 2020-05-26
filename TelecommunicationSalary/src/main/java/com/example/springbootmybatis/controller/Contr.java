package com.example.springbootmybatis.controller;


import com.example.springbootmybatis.bean.Year_And_Month;
import com.example.springbootmybatis.mapper.Search_Year;
import com.example.springbootmybatis.service.Serv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Contr {

    @Autowired
    Serv serv;

    @Autowired
    Year_And_Month year_and_month;


    @RequestMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam int id){ //@RequestParam int id,   @RequestParam int name
        try {
            String count = serv.sel(id).toString()+serv.testsearchyear().toString();
            return count;
        }catch (Exception e){
            return "查询返回出错";
        }
    }

    @RequestMapping("/welcome")
    public String index1(Model model,@RequestParam String name){

        model.addAttribute("name",name);

        List<String> arrayList = year_and_month.getList_m();
        List<Integer> arraylist1 = serv.searchyear();
        model.addAttribute("list_m",arrayList);
        model.addAttribute("list_y",arraylist1);
        if(name.equals("root")){
            return "root_com";
        }
        return "welcome";
    }

    @RequestMapping("")
    public String index(){
        return "test1";
    }

//    @RequestMapping("/root_com")
//    public String root_com(){
//
//        return "root_com";
//    }
}
