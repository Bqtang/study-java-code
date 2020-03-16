package com.example.demo.stream;

import com.alibaba.fastjson.JSON;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Description: 集合的流处理
 * @Auther: tangbingqun
 * @Date: 2020/1/17 10:29 AM
 */

public class ListStream {

    public static void main(String[] args) {

        List<String>  names = Stream.of("").collect(Collectors.toList());

        System.out.println("获取相关的值：" + JSON.toJSONString(names));

        List<Integer>  sorts = Stream.of(6,4,1,10).collect(Collectors.toList());

        Integer  min = sorts.stream().min(Comparator.comparing(o -> o.intValue())).get();

        names =  null;

        List<String> list = Optional.ofNullable(names).orElse(new ArrayList<>());
        System.out.println("问题："+ JSON.toJSONString(list));


    }



}
