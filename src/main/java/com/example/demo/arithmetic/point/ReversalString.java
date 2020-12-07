package com.example.demo.arithmetic.point;

/**
 * @Description:
 * @Auther: tangbingqun
 * @Date: 2020/12/6 5:11 PM
 */

public class ReversalString {

     public String reversalString(String s) {
          char[] chars = s.toCharArray();
          int right = 0;
          int left = chars.length - 1;
          while (right < left) {
               char temp = chars[right];
               chars[right] = chars[left];
               chars[left] = temp;

               right++;
               left--;

          }
          return new String(chars);
     }

     public static void main(String[] args) {
          System.out.println(new ReversalString().reversalString("Hello"));
     }
}
