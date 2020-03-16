package com.example.demo.design.ioc.IOC;

import com.example.demo.design.ioc.IOC.abstracts.TestCase;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Auther: tangbingqun
 * @Date: 2020/3/16 8:13 AM
 */

public class JunitApplication {

    private static final List<TestCase>   testCases = new ArrayList<>();

    public static void register (TestCase  testCase){
        testCases.add(testCase);
    }

    public static void main(String[] args) {
        for (TestCase  testCase: testCases){
            testCase.run();

        }
    }
}
