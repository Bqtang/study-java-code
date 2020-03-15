package com.example.demo.design.ocp.news;

import com.example.demo.design.model.ApiStatInfo;
import com.example.demo.design.ocp.news.abstracts.AlertHandler;

import java.util.ArrayList;
import java.util.List;

public class NewAlert {

    List<AlertHandler> alertHandlers = new ArrayList<>();

    public void addAlertHandler(AlertHandler alertHandler) {
        this.alertHandlers.add(alertHandler);
    }

    public void check(ApiStatInfo apiStatInfo) {
        for (AlertHandler handler : alertHandlers) {
             handler.check(apiStatInfo);
        }
    }

}
