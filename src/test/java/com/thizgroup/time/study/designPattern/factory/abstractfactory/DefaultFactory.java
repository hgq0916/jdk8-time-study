package com.thizgroup.time.study.designPattern.factory.abstractfactory;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.designPattern.factory.abstractfactory.DefaultFactory
 * @Description: TODO
 * @date 2020/5/14 17:17
 */
public class DefaultFactory implements AbstractFactory {

  @Override
  public Food createFood() {
    return new Food();
  }

  @Override
  public Vehicle createVehicle() {
    return new Vehicle();
  }

  @Override
  public Weapon createWeapon() {
    return new Weapon();
  }
}
