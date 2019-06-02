package com.arun.test.arrays;

import java.util.Arrays;

public class Wave {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    convertToWave(arr, 5);
    System.out.println(Arrays.toString(arr));
  }

  public static void convertToWave(int arr[], int n) {
    int tmp;
    for (int i = 0; i < n - 1; i += 2) {
      tmp = arr[i];
      arr[i] = arr[i + 1];
      arr[i + 1] = tmp;
    }
  }
}
