package com.thizgroup.time.study.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.thread.AutomicMain
 * @Description: TODO
 * @date 2020/5/22 17:15
 */
public class AutomicMain {

  static class Count {
    private AtomicInteger count = new AtomicInteger(0);

    public int getCount(){
      return count.get();
    }

    public void increase(){
      count.incrementAndGet();
    }
  }

  public static void main(String[] args) throws InterruptedException {
    Count count = new Count();
    ExecutorService executorService = Executors.newCachedThreadPool();
    for(int i=0;i<100;i++){
      executorService.execute(()->{
        count.increase();
      });
    }
    executorService.shutdown();
    executorService.awaitTermination(1, TimeUnit.DAYS);
    System.out.println(count.getCount());

    List list = new ArrayList<>();
    List<String> list1 = list;
  }

}
