package com.example.demo.rocketmq;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.MessageQueueSelector;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageQueue;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.util.List;

public class RockerMqProducer {

    public static void main(String[] args) throws MQClientException, RemotingException, InterruptedException, MQBrokerException {
        //事物消息的时候会用到。
        DefaultMQProducer  producer = new DefaultMQProducer("gp_producer_group");
        producer.setNamesrvAddr("192.168.16.102:9876"); //他从命名服务器中拿到broker地址。
        producer.start();
        for (int num = 0; num < 10; num ++){
            //topic 和 分类tags 通过标签进行帅选。
            Message  message = new Message("gp_test_topic","tagA",("hello ,rocketMq 发送 ： ---> "+num).getBytes());
            //SendResult send = producer.send(message);
            //实现顺序消费
            SendResult send = producer.send(message, new MessageQueueSelector() {
                @Override
                public MessageQueue select(List<MessageQueue> list, Message message, Object o) {
                    System.out.println("消费队列："+ list.size());
                    return list.get(0);
                }
            }, "key-"+num);
            System.out.println(send);
        }

    }
}
