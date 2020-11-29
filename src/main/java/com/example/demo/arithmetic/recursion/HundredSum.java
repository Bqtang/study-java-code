package com.example.demo.arithmetic.recursion;

/**
 * @Description: 100 求和
 * @Auther: tangbingqun
 * @Date: 2020/11/29 10:12 AM
 */

public class HundredSum {

     /**
      * 循环解决问题
      *
      * @param num
      * @return
      */
     public static Integer getSumForEach(int num) {
          Integer sum = 0;
          for (int i = 1; i <= num; i++) {
               sum = sum + i;
          }
          return sum;
     }

     /**
      * 递归解决问题
      *
      * @param num
      * @return
      */
     public static Integer getSumRecursion(int num) {
          Integer sum = 0;
          if (num == 0) {
               return 0;
          }
          sum = num + getSumRecursion(num - 1);
          return sum;
     }

     public static void main(String[] args) {
          System.out.println("循环求和 " + getSumForEach(100));
          System.out.println("递归求和 " + getSumRecursion(100));

     }
}
