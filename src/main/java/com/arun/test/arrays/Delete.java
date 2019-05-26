package com.arun.test.arrays;

import java.util.Arrays;

public class Delete {
  public static void main(String[] args) {
    int[] arr = {1, 2, 4, 5};
    int[] newArr = delete(arr, 2);
    System.out.println(Arrays.toString(newArr));

    newArr = delete(arr, 3);
    System.out.println(Arrays.toString(newArr));
  }

  private static int[] delete(int[] arr, int k) {

    if (k == arr.length - 1) {
      return Arrays.copyOf(arr, arr.length - 1);
    }

    int[] newArr = new int[arr.length - 1];

    for (int i = 0; i < arr.length - 1; i++) {
      if (i < k) {
        newArr[i] = arr[i];
      } else {
        newArr[i] = arr[i + 1];
      }
    }
    return newArr;
  }

}
