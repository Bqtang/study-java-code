package com.example.demo.leetcode.bytedance;

/**
 * @Description:  剑指 Offer 05. 替换空格
 * @Auther: tangbingqun
 * @Date: 2021/2/22 5:55 PM
 *
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 *  
 *
 * 限制：
 *
 * 0 <= s 的长度 <= 10000
 *
 */

public class ReplaceSpace_Offer05 {

     /**
      * 使用api 方式处理替换空格
      * @param s
      * @return
      */

     public String replaceSpace_0(String s){
          return  s.replaceAll(" ", "%20");
     }


     /**
      * 替换空格(提高性能，浪费空间)
      * @param s
      * @return
      */

     public String replaceSpace_1(String s){
          int len = s.length();
          char[] newArr = new char[3 * len];
          int j = 0;
          for (int i = 0; i < len; i ++){
               char c = s.charAt(i);
               if (c == ' '){
                    newArr[j++] = '%';
                    newArr[j++] = '2';
                    newArr[j++] = '0';
               }else {
                    newArr[j++] = c;
               }
          }
          return new String(newArr, 0, j);
     }


     /**
      * 替换空格（节约空间，性能下降）
      * @param s
      * @return
      */
     public String replaceSpace_2(String s){
          int len = s.length();
          int count = 0;
          int j = 0;
          for(int i = 0; i < len; i ++){
               char  c = s.charAt(i);
               if (c == ' '){
                    count ++;
               }
          }

          char[] newArr = new char[len + 2 *count];
          for (int i = 0; i < len; i ++){
               char c = s.charAt(i);
               if (c == ' '){
                    newArr[j++] = '%';
                    newArr[j++] = '2';
                    newArr[j++] = '0';
               }else {
                    newArr[j++] = c;
               }
          }
          return new String(newArr);
     }

}
