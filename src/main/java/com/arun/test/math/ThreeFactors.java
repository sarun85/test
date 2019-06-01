package com.arun.test.math;

public class ThreeFactors {
  public static void main(String[] args) {
    findExact3Factors(50);
  }

  private static void findExact3Factors(double n) {
    for (int i = 2; i <= Math.sqrt(n); i++) {
      int power = (int) Math.pow(i, 2);
      System.out.printf("%d %d %d\n", 1, i, power);
    }
  }
}
