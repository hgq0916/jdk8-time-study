package com.thizgroup.time.study.designPattern.single;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.designPattern.SingletonTest1
 * @Description: 懒汉式，有线程安全问题
 * @date 2020/5/14 15:02
 */
public class Singleton1 {

  private static Singleton1 singleton1 = null;

  private Singleton1(){}

  public static Singleton1 getInstance(){
    if(singleton1 == null){
      singleton1 = new Singleton1();
    }
    return singleton1;
  }

}
