package com.example.demo.rocketmq;

import java.util.Random;

public class RandomUtils {

    private static Random random = new Random();

    //随机数碰撞
    public static Boolean randomCrash(int num, int totalNum){
        int i = random.nextInt(totalNum);
        if (i == num){
            return Boolean.valueOf(true);
        }
        return Boolean.valueOf(false);
    }

}
