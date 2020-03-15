package com.example.demo.design.ocp;

import com.example.demo.design.model.ApiStatInfo;
import com.example.demo.design.ocp.news.ApplicationContext;

public class ClientTest {

    public static void main(String[] args) {

        ApiStatInfo   apiStatInfo = new ApiStatInfo();

        ApplicationContext.getInstance().getNewAlert().check(apiStatInfo);

    }
}
