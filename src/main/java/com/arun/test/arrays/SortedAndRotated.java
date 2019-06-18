package com.arun.test.arrays;

public class SortedAndRotated {

  public static void main(String[] args) {
    // int[] arr = {30, 20, 10, 50, 35};
    int[] arr = {9998, 9999, 9997, 9996, 9995, 9994, 9992, 9991, 9988, 9987, 9984, 11, 9, 7, 2};
    System.out.println(checkRotatedAndSorted(arr, arr.length));
  }

  static boolean checkRotatedAndSorted(int[] arr, int n) {
    int changeState = 0;
    boolean isDecreasing = arr[1] - arr[0] < 0;
    for (int i = 2; i < arr.length; i++) {
      if (arr[i] - arr[i - 1] < 0 != isDecreasing) {
        isDecreasing = arr[i] - arr[i - 1] < 0;
        changeState++;
      }
    }
    // Case of last and first element
    if (arr[0] - arr[n - 1] < 0 != isDecreasing) {
      changeState--;
    }
    System.out.println(changeState);
    if (changeState == 2) {
      return true;
    }
    return false;
  }

}
