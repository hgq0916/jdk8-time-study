package com.thizgroup.time.study.designPattern.single;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.designPattern.single.Singleton2
 * @Description: 懒汉式，线程安全，但是对整个方法加锁，效率低
 * @date 2020/5/14 15:04
 */
public class Singleton2 {

  private static Singleton2 singleton2 = null;

  private Singleton2(){}

  public static synchronized Singleton2 getInstance(){
    if(singleton2 == null){
      singleton2 = new Singleton2();
    }
    return singleton2;
  }

}
