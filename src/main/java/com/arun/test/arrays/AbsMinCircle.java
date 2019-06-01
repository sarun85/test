package com.arun.test.arrays;

public class AbsMinCircle {
  public static void main(String[] args) {
    int[] arr = {8, -8, 9, -9, 10, -11, 12};
    System.out.println(minAdjDiff(arr, arr.length));
  }

  public static int minAdjDiff(int arr[], int n) {
    int min = absDiff(arr[0], arr[1]);
    int diff;
    for (int i = 2; i < n; i++) {
      diff = absDiff(arr[i - 1], arr[i]);
      if (diff < min) {
        min = diff;
      }
    }
    diff = absDiff(arr[n - 1], arr[0]);
    if (diff < min) {
      min = diff;
    }
    return min;
  }

  static int absDiff(int a, int b) {
    return Math.abs(b - a);
  }
}
