package com.example.demo.arithmetic.point;

/**
 * @Description: 回文
 * @Auther: tangbingqun
 * @Date: 2020/12/6 5:28 PM
 */

public class LoopChar {

     public  static  boolean isPalindrome(String str) {
          String actual = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
          char[] chars = actual.toCharArray();
          int right = 0;
          int left = chars.length - 1;
          while (right > left) {
               if (chars[right] != chars[left]) {
                    return Boolean.FALSE;
               }
          }
          return Boolean.TRUE;
     }


     public static void main(String[] args) {
          String  test = "A man, a plan, a canal: Panama";
          boolean palindrome = isPalindrome(test);
          System.out.println(palindrome);

     }

}
