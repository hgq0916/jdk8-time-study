package com.thizgroup.time.study.designPattern.factory.factorymethod;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.designPattern.factory.factorymethod.PlaneFactory
 * @Description: TODO
 * @date 2020/5/14 16:59
 */
public class PlaneFactory implements MoveableFactory {

  @Override
  public Moveable create() {
    return new Plane();
  }
}
