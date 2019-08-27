package com.leetcode;

import java.util.Iterator;

import com.my.util.MyUtil;

public class SolutionCountAndSay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SolutionCountAndSay s = new SolutionCountAndSay();

		// MyUtil.print(s.countAndSay(2));
		for (int i = 1; i <= 10; i++) {
			MyUtil.print(s.countAndSay(i));
		}
	}

	public String countAndSay(int n) {
		StringBuffer sbufOld = null;
		StringBuffer sbufNew = null;
		for (int i = 1; i <= n; i++) {// 外层循环，记录第几个报数序列
			if (1 == i) {
				sbufOld = new StringBuffer("1");// 第1个报数序列是"1"
			} else {
				char keyChar = sbufOld.charAt(0);
				int count = 0;

				sbufNew = new StringBuffer();
				for (int j = 0; j < sbufOld.length(); j++) {
					if (sbufOld.charAt(j) == keyChar) {// 记录多少个连续数字
						count++;
					} else {
						sbufNew.append(String.valueOf(count));// X个Y中的X
						sbufNew.append(keyChar);// X个Y中的Y
						keyChar = sbufOld.charAt(j);
						count = 1;
					}
				}
				sbufNew.append(String.valueOf(count));// 最后一个X个Y
				sbufNew.append(keyChar);

				sbufOld = sbufNew;
			}
		}
		return sbufOld.toString();
	}

}
