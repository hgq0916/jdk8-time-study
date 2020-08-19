package com.thizgroup.time.study.designPattern.proxy;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.designPattern.proxy.NormalFamily
 * @Description: TODO
 * @date 2020/5/14 17:31
 */
public class NormalFamily implements ProxyInterface {

  @Override
  public void marry() {
    System.out.println("我们结婚了~~~");
  }
}
