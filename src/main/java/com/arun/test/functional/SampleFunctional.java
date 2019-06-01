package com.arun.test.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SampleFunctional {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    System.out.println(totalValues(numbers, num -> num % 2 == 0));
  }

  public static int totalValues(List<Integer> numbers, Predicate<Integer> selector) {
    int result = 0;
    for (int e : numbers) {
      if (selector.test(e)) {
        result += e;
      }
    }
    return result;
  }
}
