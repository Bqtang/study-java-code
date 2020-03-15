package com.example.demo.design.model;



public class MatchedRule {

    private long  maxTps;

    private long  maxErrorCount;

    private long  maxTimeoutTps;


    public Long getMaxTimeoutTps() {
        return maxTimeoutTps;
    }

    public void setMaxTimeoutTps(Long maxTimeoutTps) {
        this.maxTimeoutTps = maxTimeoutTps;
    }

    public Long getMaxTps() {
        return maxTps;
    }

    public void setMaxTps(Long maxTps) {
        this.maxTps = maxTps;
    }

    public Long getMaxErrorCount() {
        return maxErrorCount;
    }

    public void setMaxErrorCount(Long maxErrorCount) {
        this.maxErrorCount = maxErrorCount;
    }
}
