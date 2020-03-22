package com.example.demo.design.isp.config.news;

import com.example.demo.design.isp.config.model.ConfigSource;

public class Application {

    public static final RedisConfig redisConfig = new RedisConfig( new ConfigSource());
    public static final KafkaConfig kafkaConfig = new KafkaConfig(new ConfigSource());

    public static void main(String[] args) {

        ScheduledUpdater redisConfigUpdater = new ScheduledUpdater(redisConfig, 300, 300);
        redisConfigUpdater.run();


        ScheduledUpdater kafkaConfigUpdater = new ScheduledUpdater(kafkaConfig, 60, 60);
        kafkaConfigUpdater.run();
    }
}
