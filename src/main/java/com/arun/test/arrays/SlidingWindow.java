package com.arun.test.arrays;

/**
 * Converting nested for loop into a single for loop. Find maximum sum of K consecutive elements
 */
public class SlidingWindow {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println(findMaxSum(arr, 3));
  }

  private static int findMaxSum(int[] arr, int k) {
    int max_sum = 0;
    int curr_sum = 0;

    for (int i = 0; i < k; i++) {
      curr_sum += arr[i];
    }
    max_sum = curr_sum;

    for (int i = 1; i <= arr.length - k; i++) {
      curr_sum = curr_sum + arr[i + k - 1] - arr[i - 1];
      if (curr_sum > max_sum) {
        max_sum = curr_sum;
      }
    }
    return max_sum;
  }
}
