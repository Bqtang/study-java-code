package com.example.demo.design.patterns.factory;

import com.example.demo.design.patterns.factory.Pizza;

/**
 * @Description:
 * @Auther: tangbingqun
 * @Date: 2020/10/25 11:30 AM
 */

public class ChicagoStyleCheesePizza extends Pizza {

     public ChicagoStyleCheesePizza(){
          this.name = "chicago";
          this.dough = "dough";
          this.cauce = "sauce";

          this.toppings.add("mozzaralla cheese");

     }
}
