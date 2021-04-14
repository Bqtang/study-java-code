package com.example.demo.design.patterns.decorator.prize;

import com.example.demo.design.patterns.decorator.prize.IPrizeCalculator;

/**
 * @description: 基本奖金计算实现类
 * @author: tangbingqun
 * @Date: 2021/4/14 9:17 上午
 */
public class BasicPrizeCalculator  implements IPrizeCalculator {


    @Override
    public double calcPrize(String salesman) {
        return 0;
    }

}
