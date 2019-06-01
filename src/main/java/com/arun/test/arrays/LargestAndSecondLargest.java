package com.arun.test.arrays;

public class LargestAndSecondLargest {
  public static void main(String[] args) {
    int[] arr1 = {1, 2, 3, 4, 5};
    int[] arr2 = {2, 1, 2};
    largestAndSecondLargest(5, arr1);
    largestAndSecondLargest(3, arr2);
  }

  static void largestAndSecondLargest(int sizeOfArray, int arr[]) {

    int max = -1;
    int max2 = -1;

    for (int i = 0; i < sizeOfArray; i++) {
      if (max < arr[i]) {
        max2 = max;
        max = arr[i];
      } else if (max2 < arr[i] && max > arr[i]) {
        max2 = arr[i];
      }
    }
    System.out.println(max + " " + max2);
  }
}
