package com.thizgroup.time.study;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.Main
 * @Description: TODO
 * @date 2020/5/21 16:24
 */
public class Main {

  //修饰方法
  public synchronized void test1(){

  }


  public void test2(){
    // 修饰代码块
    synchronized (this){

    }
  }

}
