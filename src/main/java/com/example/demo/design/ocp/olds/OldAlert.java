package com.example.demo.design.ocp.olds;

import com.example.demo.design.enums.NotificationEmergencyLevel;
import com.example.demo.design.model.AlertRule;
import com.example.demo.design.model.Notification;


/**
 * 遵守开闭原则， 对扩展开放，对修改关闭
 */

public class OldAlert {

    private AlertRule rule;

    private Notification notification;


    public OldAlert(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }

    public void check(String api, long requestCount, long errorCount, long timeoutCount, long durationOfSeconds) {
        long tps = requestCount / durationOfSeconds;
        if (tps > rule.getMatchedRule(api).getMaxTps()) {
            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
        }
        if (errorCount > rule.getMatchedRule(api).getMaxErrorCount()) {
            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
        }

        long timeoutTps = timeoutCount / durationOfSeconds;

        if (timeoutTps > rule.getMatchedRule(api).getMaxTimeoutTps()) {
            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
        }
    }


}
