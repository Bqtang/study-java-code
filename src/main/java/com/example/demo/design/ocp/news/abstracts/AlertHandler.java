package com.example.demo.design.ocp.news.abstracts;

import com.example.demo.design.model.AlertRule;
import com.example.demo.design.model.ApiStatInfo;
import com.example.demo.design.model.Notification;

public abstract class AlertHandler {

    protected AlertRule  alertRule;

    protected Notification  notification;

    public AlertHandler(AlertRule alertRule, Notification notification){
        this.alertRule = alertRule;
        this.notification = notification;
    }

    public abstract  void check(ApiStatInfo apiStatInfo);

}
