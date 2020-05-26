package com.example.springbootmybatis.mapper;


import com.example.springbootmybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from category_ where id= #{id}")
    User find(int id);
}
