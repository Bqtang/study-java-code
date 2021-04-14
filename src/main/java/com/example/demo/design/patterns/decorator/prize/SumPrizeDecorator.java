package com.example.demo.design.patterns.decorator.prize;

/**
 * @description:
 * @author: tangbingqun
 * @Date: 2021/4/14 9:36 上午
 */
public class SumPrizeDecorator  extends  PrizeCalculatorDecorator{

    public SumPrizeDecorator(IPrizeCalculator calculator) {
        super(calculator);
    }

    @Override
    public double calcPrize(String salesman) {

        double money = super.calcPrize(salesman);

        Double  prize = MockData.RETURNED_MONEY * 0.001;
        System.out.println(salesman + "累计奖金是 " + prize);

        return money + prize;
    }


}
