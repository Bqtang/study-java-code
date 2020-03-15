package com.example.demo.design.model;

public class AlertRule {

    private  MatchedRule  matchedRule;


    public MatchedRule getMatchedRule() {
        return matchedRule;
    }


    public void setMatchedRule(MatchedRule matchedRule) {
        this.matchedRule = matchedRule;
    }



    public MatchedRule getMatchedRule(String api) {
        return new MatchedRule();
    }


}
