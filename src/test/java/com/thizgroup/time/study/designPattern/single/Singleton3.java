package com.thizgroup.time.study.designPattern.single;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.designPattern.single.Singleton3
 * @Description: 饿汉式，线程安全
 * @date 2020/5/14 15:07
 */
public class Singleton3 {

  private static Singleton3 singleton3 = new Singleton3();

  private Singleton3(){}

  public static Singleton3 getInstance(){
    return singleton3;
  }

}
