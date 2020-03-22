package com.example.demo.design.isp.config.news;

import com.example.demo.design.isp.config.model.ConfigSource;

public class RedisConfig implements Updater {

    private ConfigSource configSource;

    public RedisConfig(ConfigSource configSource) {
        this.configSource = configSource;
    }

    @Override
    public void update() {

    }
}
