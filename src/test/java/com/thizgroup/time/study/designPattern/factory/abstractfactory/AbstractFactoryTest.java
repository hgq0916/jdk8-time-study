package com.thizgroup.time.study.designPattern.factory.abstractfactory;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.designPattern.factory.abstractfactory.AbstractFactoryTest
 * @Description: TODO
 * @date 2020/5/14 17:18
 */
public class AbstractFactoryTest {

  public static void main(String[] args) {
    AbstractFactory abstractFactory = new DefaultFactory();
    Food food = abstractFactory.createFood();
    Vehicle vehicle = abstractFactory.createVehicle();
    Weapon weapon = abstractFactory.createWeapon();
    food.make();
    vehicle.run();
    weapon.fire();
  }

}
