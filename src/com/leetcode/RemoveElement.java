package com.leetcode;

import com.my.util.MyUtil;

public class RemoveElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RemoveElement s = new RemoveElement();
		
		int[] nums = null;
		int val = 9;
		MyUtil.print(s.removeElement(nums, val));
		MyUtil.print(nums);
		
		nums = new int[]{3, 2, 2, 3};
		val = 3;
		MyUtil.print(s.removeElement(nums, val));
		MyUtil.print(nums);
		
		nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
		val = 2;
		MyUtil.print(s.removeElement(nums, val));
		MyUtil.print(nums);
	}
	
	public int removeElement(int[] nums, int val) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[j++] = nums[i];
			}
		}
		return j;
	}

}
