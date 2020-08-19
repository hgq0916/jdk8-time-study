package com.thizgroup.time.study.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.designPattern.observer.XiaoMei
 * @Description: TODO
 * @date 2020/5/14 15:24
 */
public class XiaoMei {


  private List<Person> personList = new ArrayList<>();

  public void addPerson(Person person){
    personList.add(person);
  }

  public void notifyPerson(){
    for(Person person:personList){
      person.getMessage("谁先到我家谁可以陪我玩游戏");
    }
  }

}
