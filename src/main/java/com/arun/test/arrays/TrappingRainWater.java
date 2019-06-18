package com.arun.test.arrays;

public class TrappingRainWater {

  public static void main(String[] args) {
    int[] arr = {7, 4, 0, 9};
    // int[] arr = {8, 8, 2, 4, 5, 5, 1};
    System.out.println(trappingWater(arr, arr.length));
  }

  private static int trappingWater(int[] arr, int n) {
    int vol = 0;
    int max = -1;
    int max_idx = -1;
    int scd_max = -1;
    int scd_max_idx = -1;
    for (int i = 0; i < n; i++) {
      if (arr[i] > max) {
        scd_max = max;
        scd_max_idx = max_idx;
        max = arr[i];
        max_idx = i;
      } else if (arr[i] > scd_max && arr[i] < max) {
        scd_max = arr[i];
        scd_max_idx = i;
      }
    }
    int x, y;
    if (max_idx > scd_max_idx) {
      x = scd_max_idx;
      y = max_idx;
    } else {
      x = max_idx;
      y = scd_max_idx;
    }
    System.out.println(x + " " + y);
    for (int i = 0; i < n; i++) {
      if (x < i && i < y && arr[i] < scd_max) {
        vol += scd_max - arr[i];
      }
    }
    return vol;
  }
}
