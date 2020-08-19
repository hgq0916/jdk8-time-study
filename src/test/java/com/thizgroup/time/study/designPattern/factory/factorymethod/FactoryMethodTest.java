package com.thizgroup.time.study.designPattern.factory.factorymethod;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.designPattern.factory.factorymethod.FactoryMethodTest
 * @Description: TODO
 * @date 2020/5/14 17:02
 */
public class FactoryMethodTest {

  public static void main(String[] args) {
    MoveableFactory moveableFactory = new PlaneFactory();
    Moveable moveable = moveableFactory.create();
    moveable.move();
    MoveableFactory moveableFactory1 = new BroomFactory();
    Moveable moveable1 = moveableFactory1.create();
    moveable1.move();
  }

}
