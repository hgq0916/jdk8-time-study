package com.thizgroup.time.study.designPattern.factory.staticFactory;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.designPattern.factory.staticFactory.BeanZ
 * @Description: TODO
 * @date 2020/5/14 16:04
 */
public class Ford implements Car {

  @Override
  public void run() {
    System.out.println("Ford 启动了...");
  }

  @Override
  public void stop() {
    System.out.println("Ford 停止了...");
  }
}
