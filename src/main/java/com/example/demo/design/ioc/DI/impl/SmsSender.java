package com.example.demo.design.ioc.DI.impl;

import com.example.demo.design.ioc.DI.interfaces.MessageSender;

/**
 * @Description: 短信发送类
 * @Auther: tangbingqun
 * @Date: 2020/3/16 8:51 AM
 */

public class SmsSender implements MessageSender {
    @Override
    public void send(String cellphone, String message) {
        System.out.println("普通短信类");
    }
}
