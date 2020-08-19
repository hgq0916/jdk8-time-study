package com.thizgroup.time.study.designPattern.decorator;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.designPattern.decorator.vegetable
 * @Description: TODO
 * @date 2020/5/14 15:43
 */
public class Vegetable extends Food{

  private Food food;

  public Vegetable(Food food){
    this.food = food;
  }


  public String make(){
    return this.food.make()+"+"+"蔬菜";
  }


}
