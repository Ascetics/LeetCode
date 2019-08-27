package com.leetcode;

public class TwoSum {

  public static void main(String[] args) {
    TwoSum ts = new TwoSum();
    
    int[] a = new int[]{0, 3, -3, 4, -1};
    int[] r = ts.twoSum(a, -1);
    System.out.println(r[0] + " " + r[1]);
  }
  
  public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (target == nums[i] + nums[j]) {
          return new int[]{i, j};
        }
      }
    }
    return null;
  }

}
