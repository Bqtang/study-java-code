package com.example.demo.design.ioc.DI;

import com.example.demo.design.ioc.DI.impl.SmsSender;
import com.example.demo.design.ioc.DI.interfaces.MessageSender;

/**
 * @Description:
 * @Auther: tangbingqun
 * @Date: 2020/3/16 8:53 AM
 */

public class TestClient {

    public static void main(String[] args) {
        MessageSender  sender = new SmsSender();
        Notification   notification = new Notification(sender);
    }
}
