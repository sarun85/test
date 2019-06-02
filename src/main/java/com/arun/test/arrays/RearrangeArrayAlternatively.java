package com.arun.test.arrays;

import java.util.Arrays;

/**
 * Sorted Array.
 * 
 * first element should be max value, second should be min value, third should be second max, fourth
 * should be second min and so on.
 * 
 * O(1) extra space is allowed. Also, try to modify the input array as required.
 */
public class RearrangeArrayAlternatively {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    rearrangeArrayAlternatively(arr, arr.length);
    System.out.println(Arrays.toString(arr));
  }

  private static void rearrangeArrayAlternatively(int[] arr, int n) {
    int[] resultarr = new int[n];
    int idx = 0;
    int tmp;
    int left = 0;
    int right = n - 1;
    while (left < right) {
      tmp = arr[left++];
      resultarr[idx++] = arr[right--];
      resultarr[idx++] = tmp;
    }
    if (left == right) {
      resultarr[idx] = arr[left];
    }
    for (int i = 0; i < n; i++) {
      arr[i] = resultarr[i];
    }
  }

}
