package com.leetcode;

import com.my.util.MyUtil;

public class RemoveDuplicatesFromSortedArray {
	public static void main(String[] args) {
		RemoveDuplicatesFromSortedArray s = new RemoveDuplicatesFromSortedArray();
		
		int[] nums = new int[]{1, 1, 2};
		MyUtil.print(s.removeDuplicates(nums));
		MyUtil.print(nums);
		
		int[] nums1 = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
		MyUtil.print(s.removeDuplicates(nums1));
		MyUtil.print(nums1);
	}

	
	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int j = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] != nums[i]) {
				nums[j++] = nums[i];
			}
		}
		return j;
	}
}
