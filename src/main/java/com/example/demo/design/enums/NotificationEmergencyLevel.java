package com.example.demo.design.enums;


public enum NotificationEmergencyLevel {

    SEVERE("SEVERE", "严重"),
    URGENCY("URGENCY", "紧急"),
    NORMAL("NORMAL", "普通"),
    TRIVIAL("TRIVIAL", "无关紧要");

    private String code;
    private String desc;

    NotificationEmergencyLevel(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }


}
