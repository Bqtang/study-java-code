package com.example.demo.design.patterns.factory;

import com.example.demo.design.patterns.factory.Pizza;

/**
 * @Description: 纽约店面
 * @Auther: tangbingqun
 * @Date: 2020/10/25 11:29 AM
 */

public class NYStyleCheesePizza  extends Pizza {

     public NYStyleCheesePizza(){
          this.name = "chicago";
          this.dough = "dough";
          this.cauce = "sauce";

          this.toppings.add("mozzaralla cheese");

     }

     @Override
     void cut(){
          System.out.println("cut");
     }
}
