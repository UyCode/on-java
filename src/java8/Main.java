package java8;

import java8.src.entity.Apple;
import java8.src.service.AppleFancyFormatter;
import java8.src.service.AppleService;
import java8.src.service.AppleSimpleFormatter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 7/20/2021 12:02 AM
 */
public class Main {

  public static void main(String[] args) {
    //
      List<Apple> apples = new ArrayList<>(); 

      apples.add(new Apple(1L, "red", 100));
      apples.add(new Apple(2L, "blue", 150));
      apples.add(new Apple(3L, "green", 200));
      apples.add(new Apple(4L, "yellow", 250));

      prettyPrintApple(apples, new AppleFancyFormatter());
      prettyPrintApple(apples, new AppleSimpleFormatter());
  }

  public static void prettyPrintApple(List<Apple> inventories, AppleService formatter) {
    for (Apple apple : inventories) {
      String output = formatter.accept(apple);
      System.out.println(output);
    }
  }
}
