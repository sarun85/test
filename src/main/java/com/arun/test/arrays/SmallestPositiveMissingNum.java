package com.arun.test.arrays;

/**
 * Questions? is it Sorted? 
 * Expected solution in O(n) time using constant extra space.
 */
public class SmallestPositiveMissingNum {
  public static void main(String[] args) {
    int[] arr = {-30, -20, 5, 6, 4, 3, 8, -50, 1, 2, -25};
    System.out.println(smallestPositiveMissingNumber(arr, arr.length));
  }

  private static int smallestPositiveMissingNumber(int[] arr, int n) {
    int[] resultarr = new int[1000000];
    for (int i = 0; i < n; i++) {
      if (arr[i] > 0) {
        resultarr[arr[i]] = 1;
      }
    }
    for (int i = 1; i < resultarr.length; i++) {
      if (resultarr[i] == 0) {
        return i;
      }
    }
    return -1;
  }
}
