package com.arun.test.arrays;

import java.util.Arrays;

public class Insert {
  public static void main(String[] args) {
    int[] arr = {1, 2, 4, 5};
    int[] newArr = insert(arr, 3, 2);
    System.out.println(Arrays.toString(newArr));

    newArr = insert(arr, 6, 4);
    System.out.println(Arrays.toString(newArr));
  }

  private static int[] insert(int[] arr, int n, int k) {
    int[] newArr = Arrays.copyOf(arr, arr.length + 1);

    if (k == arr.length) {
      newArr[k] = n;
      return newArr;
    }

    for (int i = arr.length - 1; i >= k; i--) {
      newArr[i + 1] = arr[i];
    }
    newArr[k] = n;
    return newArr;
  }
}
