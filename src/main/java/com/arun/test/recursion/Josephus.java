package com.arun.test.recursion;

public class Josephus {
  public static void main(String[] args) {
    System.out.println(josephus(5, 2));
  }

  private static int josephus(int n, int k) {
    if (n == 1) {
      return 1;
    }
    return (josephus(n - 1, k) + k - 1) % n + 1;
  }
}
