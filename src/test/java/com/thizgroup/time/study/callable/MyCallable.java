package com.thizgroup.time.study.callable;

import java.util.concurrent.Callable;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.callable.MyCallable
 * @Description: TODO
 * @date 2020/5/13 17:01
 */
public class MyCallable implements Callable<String> {

  private int ticket = 10;

  @Override
  public String call() throws Exception {

    String result = "";
    while(ticket>0){
      System.out.println("售出车票:"+ticket);
      ticket--;
      Thread.sleep(1000);
    }
    result = "车票已售罄";

    return result;
  }
}
