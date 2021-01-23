package com.example.demo.design.patterns.isolation.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Auther: tangbingqun
 * @Date: 2021/1/23 3:21 PM
 */

public class SimpleHttpServer {

     private String host;
     private int port;
     private Map<String, List<Viewer>> viewers = new HashMap<>();

     public void addViewer(String urlDirectory, Viewer viewer) {
          if (!viewers.containsKey(viewer)) {
               viewers.put(urlDirectory, new ArrayList<Viewer>());
          }
          this.viewers.get(urlDirectory).add(viewer);
     }


     public void run() {
          //进行处理。
     }

}
