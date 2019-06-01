package com.arun.test.arrays;

import java.util.Arrays;
import java.util.List;

public class ReverseGroups {
  public static void main(String[] args) {
    List<Integer> mv = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
    System.out.println(reverseInGroups(mv, 8, 2));
  }

  public static List<Integer> reverseInGroups(List<Integer> mv, int n, int k) {
    // add your code here
    for (int i = 0; i < n; i += k) {
      int left = i;
      // to handle case when k is not multiple of n
      int right = Math.min(i + k - 1, n - 1);
      int temp;
      // reverse the sub-array [left, right]
      while (left < right) {
        temp = mv.get(left);
        mv.set(left, mv.get(right));
        mv.set(right, temp);
        left += 1;
        right -= 1;
      }
    }
    return mv;
  }
}
