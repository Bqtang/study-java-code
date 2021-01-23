package com.example.demo.design.patterns.isolation.config;

import java.util.Map;

/**
 * @Description:
 * @Auther: tangbingqun
 * @Date: 2021/1/23 3:07 PM
 */

public class KafkaConfig implements Updater, Viewer {
     @Override
     public void update() {
          System.out.println("kafka 实现热部署");

     }

     @Override
     public String outputInPlainText() {
          return null;
     }

     @Override
     public Map<String, String> output() {
          return null;
     }
}
