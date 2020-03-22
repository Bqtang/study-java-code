package com.example.demo.design.isp.config.news;

import com.example.demo.design.isp.config.model.ConfigSource;

public class KafkaConfig  implements  Updater {

    private ConfigSource configSource;


    public KafkaConfig(ConfigSource configSource) {

        this.configSource = configSource;
    }

    @Override
    public void update() {

    }
}
