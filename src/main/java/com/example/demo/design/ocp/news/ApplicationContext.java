package com.example.demo.design.ocp.news;

import com.example.demo.design.model.AlertRule;
import com.example.demo.design.model.Notification;
import com.example.demo.design.ocp.news.impl.ErrorAlertHandler;
import com.example.demo.design.ocp.news.impl.TpsAlertHandler;

public class ApplicationContext {

    private AlertRule alertRule;

    private NewAlert newAlert;

    private Notification notification;

    public void initializeBeans(){

        alertRule = new AlertRule();
        notification = new Notification();
        newAlert = new NewAlert();

        newAlert.addAlertHandler(new TpsAlertHandler(alertRule,notification));
        newAlert.addAlertHandler(new ErrorAlertHandler(alertRule,notification));
    }

    public NewAlert  getNewAlert(){
        return  newAlert;
    }

    //单例模式
    private static final ApplicationContext instance = new ApplicationContext();

    private ApplicationContext(){
        instance.initializeBeans();
    }

    public static ApplicationContext getInstance(){
        return instance;
    }


}
