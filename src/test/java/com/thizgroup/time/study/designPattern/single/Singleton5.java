package com.thizgroup.time.study.designPattern.single;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.designPattern.single.Singleton5
 * @Description: 枚举方式,线程安全，而且可以防止反序列化
 * @date 2020/5/14 15:10
 */
public enum Singleton5 {
  INSTANCE;

  public Singleton5 getInstance(){
    return INSTANCE;
  }

}
