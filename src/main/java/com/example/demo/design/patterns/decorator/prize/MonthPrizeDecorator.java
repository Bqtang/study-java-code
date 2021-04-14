package com.example.demo.design.patterns.decorator.prize;

/**
 * @description: 当月业务奖金计算器
 * @author: tangbingqun
 * @Date: 2021/4/14 9:26 上午
 */
public class MonthPrizeDecorator  extends  PrizeCalculatorDecorator{


    public MonthPrizeDecorator(IPrizeCalculator calculator) {
        super(calculator);
    }

    @Override
    public double calcPrize(String salesman) {
        double money = super.calcPrize(salesman);

        Double salesMoney = MockData.SALES_PER_SALEAMAN.get(salesman);

        double  prize = salesMoney * 0.03;

        System.out.println(salesman + " 当月的个人业务奖金是 " + prize);
        return  money + prize;
    }

}
