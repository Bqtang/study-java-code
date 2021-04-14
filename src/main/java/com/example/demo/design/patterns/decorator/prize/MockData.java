package com.example.demo.design.patterns.decorator.prize;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: tangbingqun
 * @Date: 2021/4/14 9:28 上午
 */
public class MockData {

    public static double RETURNED_MONEY = 10000;

    public static Map<String, Double> SALES_PER_SALEAMAN = new HashMap<>();


    static {
        SALES_PER_SALEAMAN.put("张三", 6000.0);
        SALES_PER_SALEAMAN.put("李四", 8000.0);
        SALES_PER_SALEAMAN.put("王五", 9000.0);
    }
}
