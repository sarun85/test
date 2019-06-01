package com.arun.test.arrays;

import java.util.Arrays;

public class MaxOccuredInteger {
  public static void main(String[] args) {
    int[] L = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] R = {0, 1, 2, 3, 4, 5, 6, 6, 8, 9};
    System.out.println(maxOccured(L, R, 10, 10));
    // prints 6
  }

  public static int maxOccured(int L[], int R[], int n, int maxx) {

    int arr[] = new int[100000];

    for (int i = 0; i < n; i++) {
      arr[L[i]] += 1;
      arr[R[i] + 1] -= 1;
    }
    System.out.println(Arrays.toString(arr));

    int msum = arr[0], ind = -1;

    for (int i = 1; i <= maxx; i++) {
      arr[i] += arr[i - 1];
      if (msum < arr[i]) {
        msum = arr[i];
        ind = i;
      }
    }
    return ind;
  }
}
