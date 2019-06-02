package com.arun.test.functional;

import java.util.Arrays;
import java.util.List;

public class Parallel {
  public static int doubleIt(int number) {
    try {
      Thread.sleep(1000);
    } catch (Exception e) {

    }
    return number * 2;
  }

  // referential transperancy- doubleIt(4) is always going to be 8.
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    System.out.println(
        numbers.parallelStream()
               .mapToInt(Parallel::doubleIt)
               .sum()
        );
  }
}
