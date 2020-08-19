package com.thizgroup.time.study.designPattern.decorator;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.designPattern.decorator.DecoratorTest
 * @Description: 装饰着模式
 * @date 2020/5/14 15:45
 */
public class DecoratorTest {

  public static void main(String[] args) {
    Bread bread = new Bread(new Vegetable(new Food("香肠")));
    System.out.println(bread.make());
  }

}
