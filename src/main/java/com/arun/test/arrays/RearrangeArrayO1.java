package com.arun.test.arrays;

import java.util.Arrays;

/**
 * Rearrange an array with O(1) extra space
 * 
 * Given an array arr[] of size N where every element is in range from 0 to n-1.
 * 
 * Rearrange the given array so that arr[i] becomes arr[arr[i]].
 * 
 * This should be done with O(1) extra space.
 *
 */
public class RearrangeArrayO1 {
  public static void main(String[] args) {
    long[] arr = {4, 0, 2, 1, 3};
    rearrangeArrayO1(arr, arr.length);
    System.out.println(Arrays.toString(arr));
  }

  private static void rearrangeArrayO1(long[] arr, int n) {
    long[] resultarr = new long[n];
    for (int i = 0; i < n; i++) {
      resultarr[i] = arr[(int) arr[i]];
    }
    for (int i = 0; i < n; i++) {
      arr[i] = resultarr[i];
    }
  }
}
