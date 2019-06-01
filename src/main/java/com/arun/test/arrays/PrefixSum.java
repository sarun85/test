package com.arun.test.arrays;

import java.util.Arrays;

/**
 * Fix Sum in a range
 *
 */
public class PrefixSum {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println(Arrays.toString(prefixSumArray(arr)));
  }

  private static int[] prefixSumArray(int[] arr) {
    int[] prefixSumArr = new int[arr.length];
    prefixSumArr[0] = arr[0];
    for (int i = 1; i < arr.length; i++) {
      prefixSumArr[i] = prefixSumArr[i - 1] + arr[i];
    }
    return prefixSumArr;
  }
}
