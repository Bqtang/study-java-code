package com.example.demo.design.patterns.factory;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * @Description: 生产pizza 工厂
 * @Auther: tangbingqun
 * @Date: 2020/10/25 10:13 AM
 */

@Component
public class PizzaFactory implements ApplicationContextAware {

     private ApplicationContext applicationContext;

     @Override
     public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
          this.applicationContext = applicationContext;
     }

     public Pizza createPizza(String styleStore,String pizzaName) {
          if (StringUtils.isEmpty(pizzaName)) {
               return null;
          }
          String clientName = String.format("%sStyleStore%sClient", styleStore, pizzaName );
          try {

               Pizza pizza = applicationContext.getBean(clientName, Pizza.class);
               return pizza;
          } catch (Exception e) {
               e.printStackTrace();
          }
          return null;

     }
}
