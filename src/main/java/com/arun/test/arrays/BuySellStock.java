package com.arun.test.arrays;

public class BuySellStock {

  public static void main(String[] args) {
    // int[] arr = {23, 13, 25, 29, 33, 19, 34, 45, 65, 67};
    int[] arr = {886, 2777, 6915, 7793, 8335, 5386, 492, 6649, 1421, 2362, 27, 8690};
    stockBuySell(arr, arr.length);
  }

  static void stockBuySell(int[] arr, int n) {
    StringBuilder sb = new StringBuilder();
    int min = 0;
    int diff = 0;
    for (int i = 1; i < arr.length; i++) {
      diff = arr[i] - arr[i - 1];
      if (diff < 0) {
        if (i != 1 && min != i - 1) {
          sb.append("(").append(min).append(" ").append(i - 1).append(") ");
        }
        min = i;
      }
      if (i == n - 1 && min != i) {
        sb.append("(").append(min).append(" ").append(i).append(") ");
      }
    }
    if (sb.length() == 0) {
      System.out.println("No Profit");
    } else {
      System.out.println(sb.toString());
    }
  }

}
