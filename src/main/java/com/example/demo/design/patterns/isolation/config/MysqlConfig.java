package com.example.demo.design.patterns.isolation.config;

import java.util.Map;

/**
 * @Description:
 * @Auther: tangbingqun
 * @Date: 2021/1/23 3:07 PM
 */

public class MysqlConfig implements Viewer {
     @Override
     public String outputInPlainText() {
          return null;
     }

     @Override
     public Map<String, String> output() {
          return null;
     }
}
