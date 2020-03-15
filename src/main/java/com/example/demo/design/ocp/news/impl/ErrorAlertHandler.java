package com.example.demo.design.ocp.news.impl;

import com.example.demo.design.enums.NotificationEmergencyLevel;
import com.example.demo.design.model.AlertRule;
import com.example.demo.design.model.ApiStatInfo;
import com.example.demo.design.model.Notification;
import com.example.demo.design.ocp.news.abstracts.AlertHandler;

public class ErrorAlertHandler extends AlertHandler {

    public ErrorAlertHandler(AlertRule alertRule, Notification notification) {
        super(alertRule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        if (apiStatInfo.getErrorCount() > alertRule.getMatchedRule(apiStatInfo.getApi()).getMaxErrorCount()){
            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
        }
    }
}
