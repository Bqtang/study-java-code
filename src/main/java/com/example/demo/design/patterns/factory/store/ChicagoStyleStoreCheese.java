package com.example.demo.design.patterns.factory.store;

import com.example.demo.design.patterns.factory.Pizza;
import org.springframework.stereotype.Component;

/**
 * @Description: 芝加哥店面
 * @Auther: tangbingqun
 * @Date: 2020/10/25 11:53 AM
 */

@Component("chicagoStyleStoreCheeseClient")
public class ChicagoStyleStoreCheese extends PizzaStoreImpl {

     @Override
     protected Pizza createPizza(String styleStore, String pizzaName) {
          return super.createPizza(styleStore, pizzaName);
     }
}
