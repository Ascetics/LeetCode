package com.leetcode;

import com.my.util.MyUtil;

public class SolutionLongestCommonPrefix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SolutionLongestCommonPrefix s = new SolutionLongestCommonPrefix();
		
		String[] strs = new String[]{"flow", "flower", "flight"};
		MyUtil.print(s.longestCommonPrefix(strs));
		
		String[] strs1 = new String[]{"dog", "racecar", "car"};
		MyUtil.print(s.longestCommonPrefix(strs1));
		
		String[] strs2 = new String[]{"", "", ""};
		MyUtil.print(s.longestCommonPrefix(strs2));
		
		String[] strs3 = new String[0];
		MyUtil.print(s.longestCommonPrefix(strs3));
	}

	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}
		int shortestLenth = Integer.MAX_VALUE;
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].length() < shortestLenth) {
				shortestLenth = strs[i].length();
			}
		}
		//
		StringBuffer commonPrefix = new StringBuffer("");
		for (int i = 0; i < shortestLenth; i++) {
			boolean diffChar = false;
			for (int j = 1; j < strs.length; j++) {
				if (strs[j - 1].charAt(i) != strs[j].charAt(i)) {
					diffChar = true;
					break;
				}
			}
			if (diffChar) {
				break;
			}
			commonPrefix.append(strs[0].charAt(i));
		}
		return commonPrefix.toString();
	}
}
