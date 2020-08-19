package com.thizgroup.time.study.designPattern.factory.staticFactory;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.designPattern.factory.staticFactory.StaticFactoryTest
 * @Description: TODO
 * @date 2020/5/14 16:07
 */
public class StaticFactoryTest {

  public static void main(String[] args) {
    Car ford = CarFactory.getCarInstance("ford");
    Car beanz = CarFactory.getCarInstance("beanz");
    ford.run();
    ford.stop();
    beanz.run();
    beanz.stop();
  }

}
