package com.arun.test.arrays;

import java.util.Arrays;

public class MaxIndexDiff {

  public static void main(String[] args) {
    int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};
    System.out.println("input : " + Arrays.toString(arr));
    findMaxIndexDiff(arr, arr.length);
    m1(arr, arr.length);
  }

  private static void findMaxIndexDiff(int[] arr, int n) {
    int max_diff = 0;
    int diff = 0;
    for (int i = 0; i < n; i++) {
      for (int j = n - 1; j >= 0; j--) {
        if (arr[i] < arr[j] & i != j) {
          diff = j - i;
          if (diff > max_diff) {
            max_diff = diff;
          }
        }
      }
    }
    System.out.println(max_diff);
  }

  private static void m1(int[] arr, int n) {
    int RMax[] = new int[n];
    int LMin[] = new int[n];
    int i, j, maxDiff;

    /*
     * Construct LMin[] such that LMin[i] stores the minimum value from (arr[0], arr[1], ... arr[i])
     */
    LMin[0] = arr[0];
    for (i = 1; i < n; ++i)
      LMin[i] = Math.min(arr[i], LMin[i - 1]);

    /*
     * Construct RMax[] such that RMax[j] stores the maximum value from (arr[j], arr[j+1],
     * ..arr[n-1])
     */
    RMax[n - 1] = arr[n - 1];
    for (j = n - 2; j >= 0; --j)
      RMax[j] = Math.max(arr[j], RMax[j + 1]);

    System.out.println(Arrays.toString(LMin));
    System.out.println(Arrays.toString(RMax));

    i = 0;
    j = 0;
    maxDiff = -1;
    while (j < n && i < n) {
      if (LMin[i] < RMax[j]) {
        maxDiff = Math.max(maxDiff, j - i);
        j = j + 1;
      } else
        i = i + 1;
    }
    System.out.println(maxDiff);
  }

}
