package com.arun.test.arrays;

import java.util.Arrays;

public class MaxProductTriplet {
  public static void main(String[] args) {
    int[] arr = {-20, 10, -10, 2, 10, -1, 2, 1};
    System.out.println(maxProductTriplet(arr, arr.length));
  }

  private static int maxProductTriplet(int[] arr, int n) {
    Arrays.sort(arr);
    return Math.max(arr[0] * arr[1] * arr[n - 1], arr[n - 1] * arr[n - 2] * arr[n - 3]);
  }
}
