package com.leetcode;


import com.my.util.MyUtil;

public class SolutionStrStr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SolutionStrStr s = new SolutionStrStr();
		
		String haystack = "hello";
		String needle = "ll";
		MyUtil.print(s.strStr(haystack, needle)); // 2
		
		haystack = "aaaaa";
		needle = "bba";
		MyUtil.print(s.strStr(haystack, needle)); // -1
		
		MyUtil.print(s.strStr(haystack, "")); // 0
		MyUtil.print(s.strStr("", needle));// -1
		MyUtil.print(s.strStr("", "")); // 0
		
		MyUtil.print(s.strStr(haystack, null)); // 0
		MyUtil.print(s.strStr(null, needle));// -1
		MyUtil.print(s.strStr(null, null)); // 0
	}
	
	public int strStr(String haystack, String needle) {
		if (needle == null || "".equals(needle)) {
			return 0;
		}
		if (haystack == null || "".equals(haystack)) {
			return -1;
		}
		return haystack.indexOf(needle);
	}

}
