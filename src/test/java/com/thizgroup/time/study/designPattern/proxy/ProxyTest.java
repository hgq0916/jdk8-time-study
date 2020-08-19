package com.thizgroup.time.study.designPattern.proxy;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.designPattern.proxy.ProxyTest
 * @Description: TODO
 * @date 2020/5/14 17:33
 */
public class ProxyTest {

  public static void main(String[] args) {
    ProxyInterface marryCompany = new MarryCompany(new NormalFamily());
    marryCompany.marry();
  }

}
