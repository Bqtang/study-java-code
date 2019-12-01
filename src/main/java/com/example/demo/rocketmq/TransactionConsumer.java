package com.example.demo.rocketmq;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
import org.apache.rocketmq.common.message.MessageExt;

import java.sql.SQLOutput;
import java.util.List;

public class TransactionConsumer {

    public static void main(String[] args) throws MQClientException {

        DefaultMQPushConsumer  pushConsumer = new DefaultMQPushConsumer("gp_tx_consumer");
        pushConsumer.setNamesrvAddr("192.168.16.102:9876");
        pushConsumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);
        pushConsumer.subscribe("order_tx_topic","*");

        pushConsumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext) {

                list.stream().forEach(message ->{
                    System.out.println(message.getKeys());
                    System.out.println("开始业务处理逻辑："+new  String(message.getBody()) + " -> key:" +message.getKeys() );
                });
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });



    }
}
