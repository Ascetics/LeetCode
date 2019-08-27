package com.leetcode;

import java.util.Arrays;

import com.my.util.MyUtil;

public class SearchInsertPosition {
	public static void main(String[] args) {
		SearchInsertPosition s = new SearchInsertPosition();

		int[] nums = null;
		MyUtil.print(s.searchInsert(nums, 3));

		nums = new int[] { 1, 3, 5, 6 };
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
