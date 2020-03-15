package com.example.demo.design.ocp.news.impl;

import com.example.demo.design.enums.NotificationEmergencyLevel;
import com.example.demo.design.model.AlertRule;
import com.example.demo.design.model.ApiStatInfo;
import com.example.demo.design.model.Notification;
import com.example.demo.design.ocp.news.abstracts.AlertHandler;

public class TimeOutTpsAlertHandler extends AlertHandler {

    public TimeOutTpsAlertHandler(AlertRule alertRule, Notification notification) {
        super(alertRule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        long timeOutTps = apiStatInfo.getTimesCount() / apiStatInfo.getDurationOfSeconds();
        if (timeOutTps > alertRule.getMatchedRule(apiStatInfo.getApi()).getMaxTimeoutTps()){
            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
        }
    }
}
