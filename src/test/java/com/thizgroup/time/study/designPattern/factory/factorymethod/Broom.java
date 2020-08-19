package com.thizgroup.time.study.designPattern.factory.factorymethod;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.designPattern.factory.factorymethod.Plane
 * @Description: TODO
 * @date 2020/5/14 16:19
 */
public class Broom implements Moveable {

  @Override
  public void move() {
    System.out.println("broom...");
  }
}
