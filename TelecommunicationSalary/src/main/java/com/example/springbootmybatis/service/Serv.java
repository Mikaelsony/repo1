package com.example.springbootmybatis.service;


import com.example.springbootmybatis.entity.User;
import com.example.springbootmybatis.mapper.Search_Year;
import com.example.springbootmybatis.mapper.Testserach;
import com.example.springbootmybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Serv {
    @Autowired
    UserMapper userMapper;
    @Autowired
    Search_Year search_year;

    @Autowired
    Testserach testserach;

    public User sel(int id){
        return userMapper.find(id);
    }

    public List<Integer> searchyear(){
        return search_year.findyear();
    }

    public List<String> testsearchyear(){
        return  testserach.findname();
    }
}
