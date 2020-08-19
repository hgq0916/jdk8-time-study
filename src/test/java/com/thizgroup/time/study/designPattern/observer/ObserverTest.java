package com.thizgroup.time.study.designPattern.observer;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.designPattern.observer.DecoratorTest
 * @Description: 观察者模式
 * @date 2020/5/14 15:26
 */
public class ObserverTest {

  public static void main(String[] args) {
    Person xiaoWang = new XiaoWang();
    Person xiaoZhang = new XiaoZhang();
    XiaoMei xiaoMei = new XiaoMei();
    xiaoMei.addPerson(xiaoWang);
    xiaoMei.addPerson(xiaoZhang);
    xiaoMei.notifyPerson();
  }

}
