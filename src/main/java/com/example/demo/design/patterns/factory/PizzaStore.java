package com.example.demo.design.patterns.factory;

/**
 * @Description:
 * @Auther: tangbingqun
 * @Date: 2020/10/25 11:44 AM
 */

public abstract class PizzaStore {

     public Pizza orderPizza(String styleStore, String pizzaName){
          Pizza pizza = createPizza(styleStore, pizzaName);
          pizza.prepare();
          pizza.bake();
          pizza.cut();
          pizza.box();
          return pizza;
     }

    protected abstract  Pizza createPizza(String styleStore, String pizzaName);

}
