package com.leetcode;

// 1. Two Sum
//
// Given an array of integers, return indices of the two numbers such that they add up to a specific
// target.
//
// You may assume that each input would have exactly one solution, and you may not use the same
// element twice.
//
// Example:
//
// Given nums = [2, 7, 11, 15], target = 9,
//
// Because nums[0] + nums[1] = 2 + 7 = 9,
// return [0, 1].
//
public class TwoSum {

  public static void main(String[] args) {
    TwoSum ts = new TwoSum();

    int[] a = new int[] {0, 3, -3, 4, -1};
    int[] r = ts.twoSum(a, -1);
    System.out.println(r[0] + " " + r[1]);
  }

  public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (target == nums[i] + nums[j]) {
          return new int[] {i, j};
        }
      }
    }
    return null;
  }

}
