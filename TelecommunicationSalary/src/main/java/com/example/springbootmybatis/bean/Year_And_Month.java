package com.example.springbootmybatis.bean;


import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class Year_And_Month {
//    List<String> list_y;
    List<String> list_m;

//    public List<String> getList_y() {
//        return list_y;
//    }
//
//    public void setList_y(List<String> list_y) {
//        this.list_y = list_y;
//    }

    public List<String> getList_m() {
        return list_m;
    }

    public void setList_m(List<String> list_m) {
        this.list_m = list_m;
    }

    @Override
    public String toString() {
        return "Year_And_Month{" +
                ", list_m=" + list_m +
                '}';
    }
}
