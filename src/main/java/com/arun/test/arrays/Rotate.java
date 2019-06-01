package com.arun.test.arrays;

import java.util.Arrays;

public class Rotate {
  public static void main(String[] args) {
    int[] arr = {2, 62, 31, 79, 6, 21, 37, 45, 27, 23, 66};
    rotate(arr, 6);
  }

  private static void rotate(int[] arr, int k) {
    partialReverse(arr, 0, k);
    System.out.println(Arrays.toString(arr));
    partialReverse(arr, k, arr.length);
    System.out.println(Arrays.toString(arr));
    reverse(arr);
    System.out.println(Arrays.toString(arr));
  }

  private static void partialReverse(int[] arr, int start, int end) {
    int tmp;
    int mid = start + (end - start) / 2;
    // System.out.println(mid);
    for (int i = start; i < mid; i++) {
      tmp = arr[i];
      arr[i] = arr[end - (i - start) - 1];
      arr[end - (i - start) - 1] = tmp;
    }
  }

  private static void reverse(int[] arr) {
    int tmp;
    for (int i = 0; i < arr.length / 2; i++) {
      tmp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = tmp;
    }
  }
}
