package com.example.demo.design.patterns.factory.store;

import com.example.demo.design.patterns.factory.Pizza;
import com.example.demo.design.patterns.factory.PizzaFactory;
import com.example.demo.design.patterns.factory.PizzaStore;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description:
 * @Auther: tangbingqun
 * @Date: 2020/10/25 12:10 PM
 */

public class PizzaStoreImpl  extends PizzaStore {

     @Autowired
     private PizzaFactory pizzaFactory;

     @Override
     protected Pizza createPizza(String styleStore, String pizzaName) {
          return  pizzaFactory.createPizza(styleStore, pizzaName);
     }
}
