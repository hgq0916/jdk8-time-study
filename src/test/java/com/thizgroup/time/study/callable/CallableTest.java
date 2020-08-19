package com.thizgroup.time.study.callable;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.junit.Test;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.callable.CallableTest
 * @Description: TODO
 * @date 2020/5/13 17:04
 */
public class CallableTest {

  @Test
  public void fun1(){
    int i=10;System.out.println(i==i++);
    MyCallable callable = new MyCallable();
    FutureTask futureTask = new FutureTask(callable);
    new Thread(futureTask).start();
    try {
      System.out.println(futureTask.get());
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }
    System.out.println("线程结束");
  }

  /**
   * 深克隆
   * @param obj
   * @param <T>
   * @return
   * @throws Exception
   */
  public static <T extends Serializable> T clone(T obj) throws Exception {
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(bos);
    oos.writeObject(obj);
    ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
    ObjectInputStream ois = new ObjectInputStream(bis);
    return (T) ois.readObject();
  }

}
