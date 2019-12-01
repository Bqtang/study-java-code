package com.example.demo.rocketmq;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.*;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.List;

public class RocketMqConsumer {

    public static void main(String[] args) throws MQClientException {

        DefaultMQPushConsumer  consumer = new DefaultMQPushConsumer("gp_consumer_group");

        consumer.setNamesrvAddr("192.168.16.102:9876");
        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);
        consumer.subscribe("gp_test_topic","*");

       /* //并行消费
        consumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext) {

                System.out.println("Receive Message"+ list);

                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS; //消息一定要进行签收
            }
        });*/

       //消息的顺序消费
       consumer.registerMessageListener(new MessageListenerOrderly() {
           @Override
           public ConsumeOrderlyStatus consumeMessage(List<MessageExt> list, ConsumeOrderlyContext consumeOrderlyContext) {

               MessageExt messageExt = list.get(0);
               if (messageExt.getReconsumeTimes() == 3){//持久化数据库

                   //重新发送消息
                   //DLQ
                   //实现衰减重重试。

                   //进行数据库的持久化
                   return ConsumeOrderlyStatus.SUCCESS;
               }
               return ConsumeOrderlyStatus.SUCCESS;
           }
       });
        consumer.start();
    }


}
