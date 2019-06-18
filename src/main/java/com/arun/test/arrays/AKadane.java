package com.arun.test.arrays;

/**
 * Maximum Sub Array Sum
 *
 */
public class AKadane {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, -2, -5, 10, -12};
    // int[] arr = {-1, -2, -3, -4};
    System.out.println(maxSubarraySum(arr, arr.length));
  }

  static int maxSubarraySum(int[] arr, int n) {
    int currentSum = 0;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      currentSum += arr[i];
      if (max < currentSum) {
        max = currentSum;
      }
      if (currentSum < 0) {
        currentSum = 0;
      }
    }
    return max;
  }

}
