package com.arun.test.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PrintFrequency {
  public static void main(String[] args) {
    int[] arr = {1, 2, 1, 2, 3, 4, 3};
    printFrequency(arr);
    printFrequencyEff(arr, arr.length);
  }

  private static void printFrequencyEff(int[] arr, int n) {
    StringBuffer str = new StringBuffer();

    // decrementing the values of array elements by 1
    // just for the sake of simplicity
    for (int i = 0; i < n; i++) {
      arr[i] = arr[i] - 1;
    }

    // changing the array elements by using mathematical formulae
    for (int i = 0; i < n; i++) {
      System.out.println("     " + Arrays.toString(arr));
      arr[arr[i] % n] = arr[arr[i] % n] + n;
      System.out.println(Arrays.toString(arr));
    }

    for (int i = 0; i < n; i++) {
      str.append(arr[i] / n + " ");
    }
    System.out.print(str);
  }

  private static void printFrequency(int[] arr) {
    Map<Integer, Integer> m1 = new HashMap<>();
    int max = 1;
    for (int i = 0; i < arr.length; i++) {
      if (m1.containsKey(arr[i])) {
        m1.put(arr[i], m1.get(arr[i]) + 1);
      } else {
        m1.put(arr[i], 1);
      }
      if (max < arr[i]) {
        max = arr[i];
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= arr.length; i++) {
      if (m1.containsKey(i)) {
        sb.append(m1.get(i) + " ");
      } else {
        sb.append("0 ");
      }
    }
    // System.out.println(sb.toString());
  }
}
