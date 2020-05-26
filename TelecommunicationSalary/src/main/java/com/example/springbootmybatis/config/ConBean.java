package com.example.springbootmybatis.config;

import com.example.springbootmybatis.bean.Year_And_Month;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;


@Configuration    //配置类需要的注解
public class ConBean {

    @Bean
    Year_And_Month year_and_month(){
        Year_And_Month y_and_m = new Year_And_Month();
        List<String> list_m = new ArrayList<>();
        for(int i=1;i<13;i++){
            list_m.add(i+"月");
        }
        y_and_m.setList_m(list_m);
        return y_and_m;
    }
}
