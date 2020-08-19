package com.thizgroup.time.study;

import org.junit.Test;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.RecursionTest
 * @Description: TODO
 * @date 2020/7/1 17:33
 */
public class RecursionTest {

  /**
   * 汉诺塔游戏
   * @param n 盘子个数
   * @param start 盘子的初始位置
   * @param transfer 中转位置
   * @param target 目标位置
   */
  public static void hanoi(int n,char start,char transfer,char target){

    if(n == 1){
      System.out.println(start+"======>"+target);
    }else if(n == 2){
      System.out.println(start+"======>"+transfer);
      System.out.println(start+"======>"+target);
      System.out.println(transfer+"======>"+target);
    }else {
      //先n-1个盘子移到中转的位置
      hanoi(n-1,start,target,transfer);
      System.out.println(start+"======>"+target);
      hanoi(n-1,transfer,start,target);
    }
  }

  @Test
  public void hanoiTest(){
    hanoi(10,'A','B','C');
  }

}
