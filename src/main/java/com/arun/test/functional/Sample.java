package com.arun.test.functional;

import java.util.Arrays;
import java.util.List;

interface Selector {
  public boolean pick(int value);
}


class EventSelector implements Selector {
  @Override
  public boolean pick(int value) {
    return value % 2 == 0;
  }
}


public class Sample {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    System.out.println(totalValues(numbers, new EventSelector()));
  }

  public static int totalValues(List<Integer> numbers, Selector selector) {
    int result = 0;
    for (int e : numbers) {
      if (selector.pick(e)) {
        result += e;
      }
    }
    return result;
  }

}
