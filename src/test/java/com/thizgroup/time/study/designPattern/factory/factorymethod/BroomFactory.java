package com.thizgroup.time.study.designPattern.factory.factorymethod;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.designPattern.factory.factorymethod.BroomFactory
 * @Description: TODO
 * @date 2020/5/14 17:00
 */
public class BroomFactory implements MoveableFactory {

  @Override
  public Moveable create() {
    return new Broom();
  }
}
