package com.example.demo.design.patterns.decorator.prize;

/**
 * @description:
 * @author: tangbingqun
 * @Date: 2021/4/14 9:42 上午
 */
public class Client {

    public static void main(String[] args) {

        IPrizeCalculator  baseCalculator = new BasicPrizeCalculator();


        PrizeCalculatorDecorator  monthPrizeDecorator = new MonthPrizeDecorator(baseCalculator);
        PrizeCalculatorDecorator sumPrizeDecorator = new SumPrizeDecorator(monthPrizeDecorator);

    }
}
