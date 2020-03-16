package com.example.demo.design.ioc.IOC.abstracts;

/**
 * @Description:
 * @Auther: tangbingqun
 * @Date: 2020/3/16 8:11 AM
 */

public abstract class TestCase {

    public void run(){
        if (doTest()){
            System.out.println("Test succeed");
        } else {
            System.out.println("Test failed");
        }
    }

    public abstract boolean  doTest();
}
