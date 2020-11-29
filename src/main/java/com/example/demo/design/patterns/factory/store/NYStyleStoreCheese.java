package com.example.demo.design.patterns.factory.store;

import com.example.demo.design.patterns.factory.Pizza;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Auther: tangbingqun
 * @Date: 2020/10/25 11:51 AM
 */

@Component("NYStyleStoreCheeseClient")
public class NYStyleStoreCheese extends PizzaStoreImpl {

     @Override
     protected Pizza createPizza(String styleStore, String pizzaName) {
          return super.createPizza(styleStore, pizzaName);
     }
}
