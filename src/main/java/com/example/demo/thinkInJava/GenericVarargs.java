package com.example.demo.thinkInJava;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: tbq
 * @DateTime: 2020/11/24 9:37 PM
 * @Description: 可变参数和泛型方法
 */
public class GenericVarargs {

    public static <T> List<T> makeList(T... args) {

        List<T> result = new ArrayList<>();
        for (T item : args) {
            result.add(item);
        }
        return result;

    }


    public static void main(String[] args) {


        List<String> ls = makeList("A");
        System.out.println(ls);


        ls = makeList("A", "B", "C");
        System.out.println(ls);

        ls = makeList("ABVCXGHJJKJKKKKKKK".split(" "));
        System.out.println(ls);


    }
}
