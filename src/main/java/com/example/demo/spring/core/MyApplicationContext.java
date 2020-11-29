package com.example.demo.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Auther: tangbingqun
 * @Date: 2020/11/19 6:29 PM
 */

public class MyApplicationContext {

     public static void main(String[] args) {
          ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("application.properties");

          SimpleBean bean = context.getBean(SimpleBean.class);
          bean.send();
          context.close();
     }
}
