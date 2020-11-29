package com.example.demo.arithmetic.recursion;

/**
 * @Description: 斐波那契数列
 * @Auther: tangbingqun
 * @Date: 2020/11/29 10:40 AM
 * <p>
 * 0、1、1、2、3、5、8、13、21、34、……
 * <p>
 * F(0)=0，F(1)=1, F(n)=F(n - 1)+F(n - 2)（n ≥ 2，n ∈ N*)
 */

public class FibonacciSequence {

     /**
      * 获取斐波那契数列数字
      *
      * @return
      */
     public Integer getFibonacciNum(int num) {
          if (num == 1) {
               return 1;
          }
          if (num == 2) {
               return 2;
          }
          return  getFibonacciNum(num - 1) + getFibonacciNum(num - 2);
     }


}
