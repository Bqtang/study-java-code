package com.example.demo.design.patterns.decorator.prize;

/**
 * @description: 计算奖金 (装饰器模式 进行功能 叠加)
 * @author: tangbingqun
 * @Date: 2021/4/14 9:13 上午
 */
public interface IPrizeCalculator {

    /**
     * 给销售人员计算奖金
     * @param salesman
     * @return
     */
    double  calcPrize(String  salesman);
}
