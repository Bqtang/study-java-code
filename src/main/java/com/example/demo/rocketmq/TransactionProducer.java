package com.example.demo.rocketmq;

import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.TransactionMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;

import java.io.UnsupportedEncodingException;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TransactionProducer {

    public static void main(String[] args) throws MQClientException, UnsupportedEncodingException, InterruptedException {

        TransactionMQProducer  transactionMQProducer = new TransactionMQProducer("gp_tx_producer");

        transactionMQProducer.setNamesrvAddr("192.168.16.102:9876");

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        transactionMQProducer.setExecutorService(executorService);
        transactionMQProducer.setTransactionListener(new TransactionListenerLocal()); //本地事务监听消息。
        transactionMQProducer.start();

        for (int n = 0; n < 10; n ++){
            String orderId = UUID.randomUUID().toString();
            String body = "{'option': 'doOrder','orderId':'"+orderId+"'}";

            Message  message = new Message("order_tx_topic","TagA", orderId,body.getBytes(RemotingHelper.DEFAULT_CHARSET));

            transactionMQProducer.sendMessageInTransaction(message,orderId+"&"+n);

            Thread.sleep(1000);
        }
    }
}
