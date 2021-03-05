package com.example.demo.design.patterns;

/**
 * @Description: 单例：懒汉模式和饿汉模式
 * @Auther: tangbingqun
 * @Date: 2021/3/4 10:33 AM
 *
 *
 * 懒汉模式
 */


public class LazySingleton {

     private static   LazySingleton   lazySingleton  = null ;

     private LazySingleton(){
     }

     /**
      * 线程非安全
      * @return
      */
     public static LazySingleton  getInstance(){
          lazySingleton = new LazySingleton();
          return  lazySingleton;
     }

     /**
      * 线程安全
      * 双重检查模式
      * @return
      */
     public static LazySingleton getInstance2(){
          if (lazySingleton == null){
               synchronized (LazySingleton.class){
                    if (lazySingleton == null){
                         return  lazySingleton = new LazySingleton();
                    }
               }
          }
          return lazySingleton;
     }


}
