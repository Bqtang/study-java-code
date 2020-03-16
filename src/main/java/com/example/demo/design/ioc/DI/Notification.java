package com.example.demo.design.ioc.DI;

import com.example.demo.design.ioc.DI.interfaces.MessageSender;

/**
 * @Description:
 * @Auther: tangbingqun
 * @Date: 2020/3/16 8:47 AM
 */

public class Notification {

    private MessageSender messageSender;

    public Notification(MessageSender messageSender){
        this.messageSender = messageSender;
    }

    public void sendMessage(String cellphone, String message){
        this.messageSender.send(cellphone,message);
    }

}
