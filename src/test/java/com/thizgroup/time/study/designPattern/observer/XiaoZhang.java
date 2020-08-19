package com.thizgroup.time.study.designPattern.observer;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.designPattern.observer.XiaoWang
 * @Description: TODO
 * @date 2020/5/14 15:22
 */
public class XiaoZhang implements Person{

  private String name = "小张";

  @Override
  public void getMessage(String s) {
    System.out.println(name+"接收到的消息："+s);
  }
}
