package com.example.demo.arithmetic.recursion;

/**
 * @Description:
 * @Auther: tangbingqun
 * @Date: 2020/11/29 10:06 AM
 */

public class RecursionExec {


     public static void exec(int num) {
          if (num == 0) {
               return;
          }
          System.out.println("代码块1 --> 获取相关值 num = "+ num);
          exec(num - 1);
          System.out.println("代码块2 --> 获取相关值 num = " + num);

     }

     public static void main(String[] args) {
          exec(3);
     }
}
