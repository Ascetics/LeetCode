package com.leetcode;

public class PalindromeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PalindromeNumber s = new PalindromeNumber();
		System.out.println(s.isPalindrome(121));
		System.out.println(s.isPalindrome(-121));
		System.out.println(s.isPalindrome(10));
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
		int d = 0;
		while (x != 0) {
			d = x % 10;
			x = x / 10;
			r = r * 10 + d;
		}
		return r == originX;
	}
}

