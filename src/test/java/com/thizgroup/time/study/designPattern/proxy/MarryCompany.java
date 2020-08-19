package com.thizgroup.time.study.designPattern.proxy;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.designPattern.proxy.MarryCompany
 * @Description: TODO
 * @date 2020/5/14 17:32
 */
public class MarryCompany implements ProxyInterface {

  private ProxyInterface proxyInterface;

  public MarryCompany(ProxyInterface proxyInterface){
    this.proxyInterface = proxyInterface;
  }

  @Override
  public void marry() {
    System.out.println("婚礼前的准备工作");
    proxyInterface.marry();
    System.out.println("婚礼后的收尾工作");
  }
}
