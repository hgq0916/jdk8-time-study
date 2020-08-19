package com.thizgroup.time.study.designPattern.single;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.designPattern.single.Singleton6
 * @Description: 双重检验锁,线程安全
 * @date 2020/5/14 15:13
 */
public class Singleton6 {

  private static Singleton6 singleton6 = null;

  private Singleton6(){}

  public static Singleton6 getInstance(){
    if(singleton6 == null){
      synchronized(Singleton6.class) {
        if(singleton6 == null){
          singleton6 = new Singleton6();
        }
      }
    }
    return singleton6;
  }
}
