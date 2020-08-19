package com.thizgroup.time.study.designPattern.factory.abstractfactory;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.designPattern.factory.abstractfactory.AbstractFactory
 * @Description: TODO
 * @date 2020/5/14 17:13
 */
public interface AbstractFactory {

  public Food createFood();

  public Vehicle createVehicle();

  public Weapon createWeapon();

}
