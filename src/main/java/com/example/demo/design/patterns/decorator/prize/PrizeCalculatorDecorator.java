package com.example.demo.design.patterns.decorator.prize;

import com.example.demo.design.patterns.decorator.prize.IPrizeCalculator;

/**
 * @description:
 * @author: tangbingqun
 * @Date: 2021/4/14 9:20 上午
 */
public  abstract class PrizeCalculatorDecorator  implements IPrizeCalculator {

    private IPrizeCalculator  calculator;

    public PrizeCalculatorDecorator(IPrizeCalculator  calculator){
        this.calculator = calculator;
    }

    @Override
    public double calcPrize(String salesman) {
        return  this.calculator.calcPrize(salesman);
    }
}
