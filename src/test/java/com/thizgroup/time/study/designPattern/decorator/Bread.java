package com.thizgroup.time.study.designPattern.decorator;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.designPattern.decorator.Bread
 * @Description: TODO
 * @date 2020/5/14 15:37
 */
public class Bread extends Food{

  private Food food;

  public Bread(Food food){
    this.food = food;
  }

  public String make(){
    return this.food.make()+"+"+"面包";
  }

}
