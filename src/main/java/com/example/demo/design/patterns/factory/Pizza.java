package com.example.demo.design.patterns.factory;

import java.util.ArrayList;

/**
 * @Description:
 * @Auther: tangbingqun
 * @Date: 2020/10/25 11:21 AM
 */

public abstract class Pizza {
     /**
      * 披萨名称
      */
     String  name;

     /**
      * 面团类型
      */
      String dough;

     /**
      * 酱料类型
      */

     String cauce;

     /**
      * 佐料
      */
     ArrayList  toppings= new ArrayList<String>();

     void prepare(){
          System.out.println("Preparing " + name);
          System.out.println("tossing dough.......");
          System.out.println("add cauce.......");
          System.out.println("add toppings......");

          for (int i = 0; i < toppings.size(); i ++){
               System.out.println("  " + toppings.get(i));
          }


     }

     void bake(){

          System.out.println("25 - 30");

     }

     void cut(){
          System.out.println("cut");

     }


     void box(){
          System.out.println("box");

     }



}
