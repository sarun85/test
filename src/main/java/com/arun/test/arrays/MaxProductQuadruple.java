package com.arun.test.arrays;

import java.util.Arrays;

public class MaxProductQuadruple {

  public static void main(String[] args) {
    int[] arr = {-20, 10, -10, 2, 10, -1, 2, 1};
    System.out.println(maxProductQuadruple(arr, arr.length));
  }

  private static int maxProductQuadruple(int[] arr, int n) {
    Arrays.sort(arr);
    int x = arr[n - 1] * arr[n - 2] * arr[n - 3] * arr[n - 4];
    int y = arr[0] * arr[1] * arr[2] * arr[3];
    int z = arr[0] * arr[1] * arr[n - 1] * arr[n - 2];
    return Math.max(x, Math.max(y, z));
  }

}
