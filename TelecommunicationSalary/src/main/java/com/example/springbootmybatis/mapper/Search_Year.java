package com.example.springbootmybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface Search_Year {
    @Select("select year from yearlist")
    List<Integer> findyear();
}
