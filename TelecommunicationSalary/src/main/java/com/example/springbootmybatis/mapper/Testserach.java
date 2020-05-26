package com.example.springbootmybatis.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface Testserach {   //查询按年份建的表
    @Select("select table_name from " +
            "information_schema.tables where table_name like '%year%'")
    List<String> findname();

//    @Update("")
}
