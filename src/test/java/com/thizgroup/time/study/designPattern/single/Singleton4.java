package com.thizgroup.time.study.designPattern.single;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.designPattern.single.Singleton4
 * @Description: 静态内部类
 * @date 2020/5/14 15:08
 */
public class Singleton4 {

  private static class SingletonHolder {
    private static Singleton4 singleton4 = new Singleton4();
  }

  private Singleton4(){}

  public static Singleton4 getInstance(){
    return SingletonHolder.singleton4;
  }

}
