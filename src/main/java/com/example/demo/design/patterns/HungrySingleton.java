package com.example.demo.design.patterns;

/**
 * @Description:
 * @Auther: tangbingqun
 * @Date: 2021/3/4 10:35 AM
 */

public class HungrySingleton {

     private static final HungrySingleton   hungrySingleton = new HungrySingleton();

     private HungrySingleton(){}

     Object  object = new Object();

     public static HungrySingleton getInstance(){
          return hungrySingleton;
     }


}
