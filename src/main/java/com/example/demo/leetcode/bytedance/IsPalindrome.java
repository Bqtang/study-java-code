package com.example.demo.leetcode.bytedance;

/**
 * @Description: 9. 回文数 ---> 使用双指针进行解答
 * @Auther: tangbingqun
 * @Date: 2020/12/28 9:14 AM
 * <p>
 * 题目： 9. 回文数
 * <p>
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 121
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 * <p>
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * 进阶:
 * 你能不将整数转为字符串来解决这个问题吗？
 */

public class IsPalindrome {
     public static boolean isPalindrome(int x) {
          String str = String.valueOf(x);
          char[] chars = str.toCharArray();
          int lo = 0;
          int hi = str.length() - 1;
          while (lo < hi) {
               if (chars[lo] != chars[hi]) {
                    return false;
               }
               lo++;
               hi--;
          }
          return true;
     }

     public static void main(String[] args) {
          int test = 12332;
          boolean palindrome = isPalindrome(test);
          System.out.println(palindrome);


     }


}
