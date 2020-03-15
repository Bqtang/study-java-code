package com.example.demo.design.ocp.news.impl;

import com.example.demo.design.enums.NotificationEmergencyLevel;
import com.example.demo.design.model.AlertRule;
import com.example.demo.design.model.ApiStatInfo;
import com.example.demo.design.model.Notification;
import com.example.demo.design.ocp.news.abstracts.AlertHandler;

public class TpsAlertHandler extends AlertHandler {

    public TpsAlertHandler(AlertRule alertRule, Notification notification) {
        super(alertRule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        long tps = apiStatInfo.getRequestCount() /apiStatInfo.getDurationOfSeconds();
        if (tps > alertRule.getMatchedRule(apiStatInfo.getApi()).getMaxTps()){
            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
        }
    }
}
