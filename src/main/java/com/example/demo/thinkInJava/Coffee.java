package com.example.demo.thinkInJava;

/**
 * @Author: tbq
 * @DateTime: 2020/11/24 9:12 PM
 * @Description:
 */
public class Coffee {

    private static long counter = 0;

    private final long id = counter++;

    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}

class Latte extends Coffee {

}


class Mocha extends Coffee {

}
