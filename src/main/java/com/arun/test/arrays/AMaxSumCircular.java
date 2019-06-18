package com.arun.test.arrays;

public class AMaxSumCircular {

  public static void main(String[] args) {
    // int[] arr = {10, -3, -4, 7, 6, 5, -4, -1};
    int[] arr = {-1, -2, -3, -4, -1};
    System.out.println(Integer.max(kadane(arr, arr.length), reverseKadane(arr, arr.length)));
  }


  // finding the subarray with max sum
  static int kadane(int arr[], int n) {
    int maxend = arr[0];
    int maxi = arr[0];
    for (int i = 1; i < n; i++) {
      maxend = Integer.max(maxend + arr[i], arr[i]);
      maxi = Integer.max(maxi, maxend);
    }
    return maxi;
  }

  // function to find the part of array which is to be excluded
  static int reverseKadane(int arr[], int n) {
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += arr[i];
    }
    int min_minus = 0;
    int maxi = sum;
    for (int i = 0; i < n; i++) {
      min_minus = Integer.min(min_minus + arr[i], arr[i]);
      if (min_minus == sum)
        return Integer.MIN_VALUE;
      maxi = Integer.max(maxi, sum - min_minus);
    }
    return maxi;
  }

}
