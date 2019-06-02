package com.arun.test.arrays;

/**
 * An element of array is leader if it is greater than or equal to all the elements to its right
 * side. Also, the rightmost element is always a leader
 *
 */
public class Leaders {
  public static void main(String[] args) {
    int[] arr = {5, 4, 2, 3, 1};
    printLeaders(arr, arr.length);
  }

  private static void printLeaders(int[] arr, int n) {
    int[] arr1 = new int[n];
    arr1[n - 1] = arr[n - 1];
    for (int i = n - 1; i > 0; i--) {
      if (arr[i - 1] > arr1[i]) {
        arr1[i - 1] = arr[i - 1];
      } else {
        arr1[i - 1] = arr1[i];
      }
    }
    // System.out.println(Arrays.toString(arr1));
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      if (arr[i] == arr1[i]) {
        sb.append(arr[i] + " ");
      }
    }
    System.out.println(sb.toString());
  }


}
