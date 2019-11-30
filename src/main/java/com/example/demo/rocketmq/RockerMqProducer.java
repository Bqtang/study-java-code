package com.example.demo.rocketmq;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

public class RockerMqProducer {

    public static void main(String[] args) throws MQClientException, RemotingException, InterruptedException, MQBrokerException {
        //事物消息的时候会用到。
        DefaultMQProducer  producer = new DefaultMQProducer("gp_producer_group");
        producer.setNamesrvAddr("172.18.0.99:9876"); //他从命名服务器中拿到broker地址。
        producer.start();
        for (int num = 0; num < 10; num ++){
            //topic 和 分类tags 通过标签进行帅选。
            Message  message = new Message("gp_test_topic","tagA",("hello ,rocketMq 发送 ： ---> "+num).getBytes());
            SendResult send = producer.send(message);
            System.out.println(send);
        }

    }
}
