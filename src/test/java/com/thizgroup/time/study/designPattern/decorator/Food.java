package com.thizgroup.time.study.designPattern.decorator;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.designPattern.decorator.Food
 * @Description: TODO
 * @date 2020/5/14 15:36
 */
public class Food {

  private String food_name;

  public Food(){}

  public Food(String food_name){
    this.food_name = food_name;
  }

  public String make(){
    return this.food_name;
  }

}
