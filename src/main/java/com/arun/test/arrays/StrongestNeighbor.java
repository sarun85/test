package com.arun.test.arrays;

public class StrongestNeighbor {
  public static void main(String[] args) {
    int[] arr = {1, 1, 2, 3, 4, 5, 6, 6};
    maximumAdjacent(8, arr);
  }

  static void maximumAdjacent(int sizeOfArray, int arr[]) {
    // StringBuilder improves the performance here.
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i < sizeOfArray; i++) {
      if (arr[i] > arr[i - 1]) {
        sb.append(arr[i] + " ");
      } else {
        sb.append(arr[i - 1] + " ");
      }
    }
    System.out.print(sb);
  }
}
