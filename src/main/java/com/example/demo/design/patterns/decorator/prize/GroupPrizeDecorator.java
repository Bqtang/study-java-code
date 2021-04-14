package com.example.demo.design.patterns.decorator.prize;

/**
 * @description: 当月团队奖金
 * @author: tangbingqun
 * @Date: 2021/4/14 9:39 上午
 */
public class GroupPrizeDecorator  extends  PrizeCalculatorDecorator{

    public GroupPrizeDecorator(IPrizeCalculator calculator) {
        super(calculator);
    }

    @Override
    public double calcPrize(String salesman) {
        double money = super.calcPrize(salesman);

        double group = 0;
        for (Double d : MockData.SALES_PER_SALEAMAN.values()){
            group += d;
        }

        double prize = group * 0.01;

        System.out.println(salesman + "的当月团队奖金是 " + prize);
        return  money + prize;
    }

}
