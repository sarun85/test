package com.arun.test.math;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FirstEvenGT3 {
  public static void main(String[] args) {
    System.out.println(firstEventGt3(Arrays.asList(1, 2, 3, 5, 7, 8)));
    System.out.println(firstEventGt3Functioanl(Arrays.asList(1, 2, 3, 5, 7, 8)));

    System.out.println(firstEventGtNFunctioanl(Arrays.asList(1, 2, 3, 5, 7, 8), 3));
  }

  private static int firstEventGt3(List<Integer> list) {
    for (Integer e : list) {
      if (e > 3 && e % 2 == 0) {
        return e * 2;
      }
    }
    return 0;
  }

  private static int firstEventGt3Functioanl(List<Integer> list) {
    Predicate<Integer> greaterThan3 = num -> num > 3;
    Predicate<Integer> isEven = num -> num % 2 == 0;
    return list.stream().filter(greaterThan3.and(isEven)).findFirst().map(e -> e * 2).orElse(0);
  }

  private static int firstEventGtNFunctioanl(List<Integer> list, int n) {
    Function<Integer, Predicate<Integer>> isgreaterThan = pivot -> 
                                                              num -> num > pivot;
    Predicate<Integer> isEven = num -> num % 2 == 0;
    return list.stream().filter(isgreaterThan.apply(n).and(isEven)).findFirst().map(e -> e * 2)
        .orElse(0);
  }

}
