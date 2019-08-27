package com.leetcode;

public class SolutionReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SolutionReverse s = new SolutionReverse();
		
		System.out.println(s.reverse(Integer.MIN_VALUE));
//		System.out.println(s.reverse(Integer.MAX_VALUE));
//		System.out.println(s.reverse(0));
//		System.out.println(s.reverse(1));
//		System.out.println(s.reverse(1007));
//		System.out.println(s.reverse(Integer.MAX_VALUE - 1));
//		System.out.println(s.reverse(123));
//		System.out.println(s.reverse(-123));
//		System.out.println(s.reverse(120));
	}

	public int reverse(int x) {
		// 负数
		boolean isNegative = false;
		if (x < 0) {
			isNegative = true;
		}
		// 检测反转后整数溢出，返回0
		int absX = Math.abs(x);
		if (absX == Integer.MIN_VALUE) { //负2^32-1
			return 0;
		}		
		StringBuffer sbuf = new StringBuffer(String.valueOf(absX));
		String reverseStrAbsX = sbuf.reverse().toString();
		String strMaxValue = String.valueOf(Integer.MAX_VALUE);
		if ((reverseStrAbsX.length() >= strMaxValue.length()) && reverseStrAbsX.compareTo(strMaxValue) > 0) {
			return 0;
		}
		int reverseAbsX = Integer.parseInt(reverseStrAbsX);
		return isNegative ? -reverseAbsX : reverseAbsX;
	}
}

