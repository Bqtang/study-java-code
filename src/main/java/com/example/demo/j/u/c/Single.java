package com.example.demo.j.u.c;

import java.util.concurrent.Phaser;

/**
 * @Author: tbq
 * @DateTime: 2020/7/19 10:02 AM
 * @Description:
 */
public class Single {
    //禁止指令重排序
    // 1.申请内存资源
    // 2.设置初始值
    // 3.给初始值赋值。
    private static volatile Single INSTANCE;

    private Single() {
    }

    //双重检查模型
    public static Single getInstance() {
        if (INSTANCE == null) {
            synchronized (Single.class) {
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Single();
                }
            }
        }
        return INSTANCE;
    }

    Phaser  phaser = new Phaser();
}
