package com.leetcode;

import java.util.Arrays;

import com.my.util.MyUtil;

// 35. Search Insert Position
//
// Given a sorted array and a target value, return the index if the target is found. If not, return
// the index where it would be if it were inserted in order.
//
// You may assume no duplicates in the array.
//
// Example 1:
//
// Input: [1,3,5,6], 5
// Output: 2
// Example 2:
//
// Input: [1,3,5,6], 2
// Output: 1
// Example 3:
//
// Input: [1,3,5,6], 7
// Output: 4
// Example 4:
//
// Input: [1,3,5,6], 0
// Output: 0

public class SearchInsertPosition {
  public static void main(String[] args) {
    SearchInsertPosition s = new SearchInsertPosition();

    int[] nums = null;
    MyUtil.print(s.searchInsert(nums, 3));

    nums = new int[] {1, 3, 5, 6};
    MyUtil.print(s.searchInsert(nums, 5));// 2
    MyUtil.print(s.searchInsert(nums, 2));// 1
    MyUtil.print(s.searchInsert(nums, 7));// 4
    MyUtil.print(s.searchInsert(nums, 0));// 0
  }

  public int searchInsert(int[] nums, int target) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    int result = Arrays.binarySearch(nums, target);
    return result < 0 ? -(1 + result) : result;
  }
}
