package com.example.demo.stream;

import com.alibaba.fastjson.JSON;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Description: 集合的流处理
 * @Auther: tangbingqun
 * @Date: 2020/1/17 10:29 AM
 */

public class ListStream {

    public static void main(String[] args) {

        String   str = new String("1");

        String  testStr = str + "1";
        System.out.println(testStr);

        StringBuilder   builder = new StringBuilder();
        StringBuilder append = builder.append("1").append("1").append("1");
        System.out.println(append);

        StringBuffer  buffer = new StringBuffer();
        StringBuffer append1 = buffer.append("1").append("2").append("1");
        System.out.println(append1);


    }



}
