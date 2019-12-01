package com.example.demo.rocketmq;

import org.apache.rocketmq.client.producer.LocalTransactionState;
import org.apache.rocketmq.client.producer.TransactionListener;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.HashMap;
import java.util.Map;

public class TransactionListenerLocal implements TransactionListener {

    Map<String, Boolean> results = new HashMap<>();

    //执行本地事务
    @Override
    public LocalTransactionState executeLocalTransaction(Message message, Object o) {
        System.out.println("开始执行本地事务："+ o.getClass());
        String orderId = o.toString();
        //模拟数据库的保存
        Boolean  result = RandomUtils.randomCrash(2, 3);
        results.put(orderId, result);
        return result ? LocalTransactionState.COMMIT_MESSAGE : LocalTransactionState.UNKNOW;
    }

    //提供普给事务执行状态检查的回调方法，给brocker用的
    @Override
    public LocalTransactionState checkLocalTransaction(MessageExt messageExt) {
        String orderId = messageExt.getKeys();
        System.out.println("执行事务回调检查 orderId" + orderId);
        Boolean rs =results.get(orderId);
        System.out.println("数据处理结果是："+ rs);
        return rs ? LocalTransactionState.COMMIT_MESSAGE:LocalTransactionState.ROLLBACK_MESSAGE;
    }
}
