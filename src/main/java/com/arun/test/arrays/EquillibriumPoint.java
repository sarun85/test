package com.arun.test.arrays;

public class EquillibriumPoint {
  public static void main(String[] args) {
    // long[] arr = {2, 2, 2, 2, 2, 6, 5, 5};
    // long[] arr = {27, 4, 25, 6, 6, 1, 27, 22, 19, 29, 6, 9, 36, 24, 6, 15, 5};
    long[] arr = {2, 2, 2, 2, 2, 6, 5, 5};
    System.out.println(findEquillibriumPoint(arr, arr.length));
  }

  private static long findEquillibriumPoint(long[] arr, int n) {
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += arr[i];
    }
    int leftSum = 0;
    for (int i = 0; i < n; i++) {
      sum -= arr[i];
      if (leftSum == sum) {
        return i + 1;
      }
      leftSum += arr[i];
    }
    return -1;
  }
}
