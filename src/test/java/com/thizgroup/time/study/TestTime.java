package com.thizgroup.time.study;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import org.junit.Test;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.TestTime
 * @Description: TODO
 * @date 2020/4/20 15:10
 */
public class TestTime {

  public static void main(String[] args) throws Exception{
    //LocalDateTime
    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime);
    //LocalDate
    LocalDate localDate = LocalDate.now();
    System.out.println(localDate);
    //LocalTime
    LocalTime localTime = LocalTime.now();
    System.out.println(localTime);

    System.out.println("-------------------");
    //指定日期时分秒
    //LocalDateTime localDateTime1 = LocalDateTime.of(2019,5,20,12,45,55);
    LocalDateTime localDateTime1 = LocalDateTime.of(2019,5,20,12,45,55);
    System.out.println(localDateTime1);
    //指定日期
    LocalDate localDate1 = LocalDate.of(2008,06,7);
    System.out.println(localDate1);
    //指定时间
    LocalTime localTime1 = LocalTime.of(12,45,30);
    System.out.println(localTime1);
  }


  @Test
  public void fun1(){
    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime);
    //     * getYear()：
    //     * 获取年
    System.out.println(localDateTime.getYear());
    //     * getMonth()：
    //     * 获得月份(返回一个 Month 枚举值)
    System.out.println(localDateTime.getMonth());
    //     * ldt.getHour()：
    //     * 获取小时
    System.out.println(localDateTime.getHour());
    //     * getMinute():
    //     * 获取分钟
    System.out.println(localDateTime.getMinute());
    //     * getSecond():
    //     * 获取秒值
    System.out.println(localDateTime.getSecond());
    //     * getDayOfMonth()：
    //     * 获得月份天数(1-31)
    System.out.println(localDateTime.getDayOfMonth());
    //     * getDayOfYear()：
    //     * 获得年份天数(1-366)
    System.out.println(localDateTime.getDayOfYear());
    //     * getDayOfWeek()：
    //     * 获得星期几(返回一个 DayOfWeek枚举值)
    System.out.println(localDateTime.getDayOfWeek());
    //     * getMonthValue()：
    //     * 获得月份(1-12)
    System.out.println(localDateTime.getMonthValue());

  }

  /**
   * 日期格式化
   */
  @Test
  public void fun2(){
    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println("now:"+localDateTime);
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String dateString = localDateTime.format(dateTimeFormatter);
    System.out.println(dateString);
  }

  /**
   * 将日期时间对象转换为日期对象，时间对象
   */
  @Test
  public void fun3(){
    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime);
    LocalDate localDate = localDateTime.toLocalDate();
    System.out.println(localDate);
    LocalTime localTime = localDateTime.toLocalTime();
    System.out.println(localTime);
  }

  /**
   * 判断日期的方法
   */
  @Test
  public void fun4(){
    LocalDateTime localDateTime = LocalDateTime.now();
    LocalDateTime localDateTime1 = LocalDateTime.of(2020, 4, 28, 0, 0, 0);
    System.out.println("localDateTime:"+localDateTime+",localDateTime1:"+localDateTime1);
    System.out.println(localDateTime.isAfter(localDateTime1));
    System.out.println(localDateTime1.isBefore(localDateTime));
    System.out.println(localDateTime1.isAfter(localDateTime));
    System.out.println(localDateTime.isBefore(localDateTime1));
    System.out.println(localDateTime.equals(LocalDateTime.now()));
    System.out.println(localDateTime.equals(localDateTime));

    /**
     * 判断是否是闰年
     */
    System.out.println(LocalDate.now().isLeapYear());
  }

  /**
   * 解析日期字符串
   */
  @Test
  public void fun5(){
    LocalDate localDate = LocalDate.parse("2020-01-16");//按照默认格式解析
    System.out.println(localDate);
    LocalDateTime localDateTime = LocalDateTime.parse("2020-02-14T14:15:16.234");
    System.out.println(localDateTime);
    LocalTime localTime = LocalTime.parse("14:09:40.345");
    System.out.println(localTime);
    LocalDateTime localDateTime1 = LocalDateTime
        .parse("2020年04月24日12时24分30秒", DateTimeFormatter.ofPattern("yyyy年MM月dd日HH时mm分ss秒"));
    System.out.println(localDateTime1);
  }

  /**
   * 增减年月日时分秒的方法
   */
  @Test
  public void fun6(){
    LocalDateTime now = LocalDateTime.now();
    System.out.println(now.plusYears(1));//加一年
    System.out.println(now.plusYears(-1));//减一年
    //增加指定月份
    System.out.println(now.plusMonths(2));
    //增加指定周
    System.out.println(now.plusWeeks(3));
    //增加指定日
    System.out.println(now.plusDays(4));
    //增加指定小时
    System.out.println(now.plusHours(5));
    //增加指定分钟
    System.out.println(now.plusMinutes(10));
    //增加指定秒
    System.out.println(now.plusSeconds(30));
    //增加指定纳秒
    System.out.println(now.plusNanos(100));

    System.out.println("-----------------------");

    //    minusYears(int offset)：
    //    减少指定年
    System.out.println(now.minusYears(7));
    //    minusMonths(int offset)：
    //    减少指定月
    System.out.println(now.minusMonths(3));
    //    minusWeeks(int offset)：
    //    减少指定周
    System.out.println(now.minusWeeks(1));
    //    minusDates(int offset)：
    //    减少指定日
    System.out.println(now.minusDays(3));
    //    minusHours(int offset)：
    //    减少指定时
    System.out.println(now.minusHours(5));
    //    minusMinuets(int offset)：
    //    减少指定分
    System.out.println(now.minusMinutes(10));
    //    minusSeconds(int offset)：
    //    减少指定秒
    System.out.println(now.minusSeconds(30));
    //    minusNanos(int offset)：
    //    减少指定纳秒
    System.out.println(now.minusNanos(200));
  }

  /**
   * 指定年月日时分秒
   */
  @Test
  public void fun7(){
    LocalDateTime now = LocalDateTime.now();
    System.out.println(now);
    LocalDateTime localDateTime = now.withYear(2013);
    System.out.println(localDateTime);
    //TemporalAdjuster类，提供了获取日期的特殊方法
    LocalDate localDate = LocalDate.now();
    LocalDate fistDayOfMonth = localDate.with(TemporalAdjusters.firstDayOfMonth());
    System.out.println(fistDayOfMonth);
    LocalDate firstDayOfNextMonth = localDate.with(TemporalAdjusters.firstDayOfNextMonth());
    System.out.println(firstDayOfNextMonth);
    //获取第二个星期五是几号
    System.out.println(localDate.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.FRIDAY)));
  }

  /**
   * TemporalAdjuster 时间矫正器
   */
  @Test
  public void fun8(){
    LocalDate localDate = LocalDate.now();
    LocalDate firstDayOfMonth = localDate.with(TemporalAdjusters.firstDayOfMonth());//获取本月第一天
    System.out.println(firstDayOfMonth);
    //获取下个周末
    LocalDate nextSunday = localDate.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
    System.out.println(nextSunday);
    //自定义日期，获取下一个工作日
    LocalDate nextWorkDay = localDate.with(temporal -> {
      LocalDate localDate1 = (LocalDate) temporal;
      if(localDate1.getDayOfWeek().equals(DayOfWeek.FRIDAY)){
        return localDate1.plusDays(3);
      }else if(localDate1.getDayOfWeek().equals(DayOfWeek.SATURDAY)){
        return localDate1.plusDays(2);
      }else {
        return localDate1.plusDays(1);
      }
    });
    System.out.println(nextWorkDay);
  }

  /**
   * 时间戳
   */
  @Test
  public void fun9(){
    Instant now = Instant.now();
    System.out.println(now);
    //获取当前时区的时间
    OffsetDateTime offsetDateTime = now.atOffset(ZoneOffset.ofHours(8));
    System.out.println(offsetDateTime);
    //从1970.1.1 0：0：0到当前时间的毫秒值

  }


}
