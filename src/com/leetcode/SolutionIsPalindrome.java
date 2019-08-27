package com.leetcode;

public class SolutionIsPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SolutionIsPalindrome s = new SolutionIsPalindrome();
		System.out.println(s.isPalindrome(121));
		System.out.println(s.isPalindrome(-121));
		System.out.println(s.isPalindrome(10));
	}

	public boolean isPalindrome1(int x) {
		if (x < 0) {
			return false;
		}
		StringBuffer sbuf = new StringBuffer(String.valueOf(x));
		int reverseX = Integer.parseInt(sbuf.reverse().toString());
//		System.out.println(reverseX);
		if (x == reverseX) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		if (x == 0) {
			return true;
		}
		final int originX = x;
		int r = 0;
		while (x != 0) {
			int d = x % 10;
			x = x / 10;
			r = r * 10 + d;
		}
		return r == originX;
	}
}

