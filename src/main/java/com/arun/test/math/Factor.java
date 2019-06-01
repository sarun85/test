package com.arun.test.math;

public class Factor {
  public static void main(String[] args) {
    printFactors(16);
  }

  private static void printFactors(int n) {
    for (int i = 1; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        // If divisors are equal, print only one
        if (n / i == i)
          System.out.printf("%d ", i);

        else // Otherwise print both
          System.out.printf("%d %d ", i, n / i);
      }
    }
  }
}
