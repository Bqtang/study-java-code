package com.example.demo.design.patterns.isolation.config;

/**
 * @Description:
 * @Auther: tangbingqun
 * @Date: 2021/1/23 3:06 PM
 */

public class RedisConfig  implements  Updater{

     @Override
     public void update() {
          System.out.println("kafka 实现热部署");

     }
}
