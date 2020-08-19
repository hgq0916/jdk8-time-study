package com.thizgroup.time.study.designPattern.factory.staticFactory;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.designPattern.factory.staticFactory.CarFactory
 * @Description: TODO
 * @date 2020/5/14 16:05
 */
public class CarFactory {

  public static Car getCarInstance(String type){
    Car car = null;
    switch (type){
      case "beanz":
        car = new Beanz();
        break;
      case "ford":
        car = new Ford();
        break;
    }

    return car;
  }

}
