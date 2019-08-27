package com.leetcode;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		int i = 1;
//		int j = i++;
//		if ((i == (++j)) && ((i++) == j)) {
//			i += j;
//		}
//		System.out.println("i = " + i);
		
		int x = 10;
		double y = 20.2;
		long z = 10L;
		String str = "" + x + y * z;
		System.out.println(str);
	}
	
	public static int inc(int temp) {
		if (temp > 0) {
			return temp * 2;
		}
		return -1;
	}

}
