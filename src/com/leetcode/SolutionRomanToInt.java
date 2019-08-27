package com.leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SolutionRomanToInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SolutionRomanToInt s = new SolutionRomanToInt();
		
		System.out.println(s.romanToInt("I"));// I = 1
		System.out.println(s.romanToInt("V"));// V = 5
		System.out.println(s.romanToInt("X"));// X = 10
		System.out.println(s.romanToInt("L"));// L = 50
		System.out.println(s.romanToInt("C"));// C = 100
		System.out.println(s.romanToInt("D"));// D = 500
		System.out.println(s.romanToInt("M"));// M = 1000
		
		System.out.println(s.romanToInt("II"));//II = 2
		System.out.println(s.romanToInt("XII"));//XII = 12
		System.out.println(s.romanToInt("XXVII"));//XXVII = 27
		
		System.out.println(s.romanToInt("IV"));//IV = 4
		System.out.println(s.romanToInt("IX"));//IX = 9
		System.out.println(s.romanToInt("XL"));//XL = 40
		System.out.println(s.romanToInt("XC"));//XC = 90
		System.out.println(s.romanToInt("CD"));//CD = 400
		System.out.println(s.romanToInt("CM"));//CM = 900
		
		System.out.println(s.romanToInt("III"));//III = 3
		System.out.println(s.romanToInt("IV"));//IV = 4
		System.out.println(s.romanToInt("IX"));//IX = 9
		System.out.println(s.romanToInt("LVIII"));//LVIII = 58
		System.out.println(s.romanToInt("MCMXCIV"));//MCMXCIV = 1994
		
		System.out.println(s.romanToInt("MVII"));//MVII = 1007
	}

	/**
	 * 字符  数值
	 * I = 1
	 * V = 5
	 * X = 10
	 * L = 50
	 * C = 100
	 * D = 500
	 * M = 1000
	 * 
	 * II = 2
	 * XII = 12
	 * XXVII = 27
	 * 
	 * I在VX左边表示减
	 * IV = 4
	 * IX = 9
	 * 
	 * X在LC左边表示减
	 * XL = 40
	 * XC = 90 
	 * 
	 * C在DM左边表示减
	 * CD = 400
	 * CM = 900
	 * 
	 * @param s
	 * @return
	 */
	public int romanToInt(String s) {
		int result = 0;
		
		s = s.toUpperCase();
		
		// 1000
		int thousand = 0;
		Pattern pThousand = Pattern.compile("M*");
		Matcher mThousand = pThousand.matcher(s);
		mThousand.matches();
		if (mThousand.find(0)) {
			String sThouand = s.substring(mThousand.start(), mThousand.end());
			for (int i = 0; i < sThouand.length(); i++) {
				if ('M' == sThouand.charAt(i)) {
					thousand += 1000;
				}
			}
		}
		s = s.substring(mThousand.end());
		
		// 100
		int hundred = 0;
		if (s.startsWith("CM")) {
			hundred = 900;
			s = s.substring(2);
		} else if (s.startsWith("CD")) {
			hundred = 400;
			s = s.substring(2);
		} else {
			Pattern pHundred = Pattern.compile("D?C*");
			Matcher mHundred = pHundred.matcher(s);
			mHundred.matches();
			if (mHundred.find(0)) {
				String sHundred = s.substring(mHundred.start(), mHundred.end());
				for (int i = 0; i < sHundred.length(); i++) {
					if (0 == i && 'D' == sHundred.charAt(i)) {
						hundred += 500;
					}
					if ('C' == sHundred.charAt(i)) {
						hundred += 100;
					}
				}
			}
			s = s.substring(mHundred.end());
		}
		
		// 10
		int decade = 0;
		if (s.startsWith("XC")) {
			decade = 90;
			s = s.substring(2);
		} else if (s.startsWith("XL")) {
			decade = 40;
			s = s.substring(2);
		} else {
			Pattern pDecade = Pattern.compile("L?X*");
			Matcher mDecade = pDecade.matcher(s);
			mDecade.matches();
			if (mDecade.find(0)) {
				String sDecade = s.substring(mDecade.start(), mDecade.end());
				for (int i = 0; i < sDecade.length(); i++) {
					if (0 == i && 'L' == sDecade.charAt(i)) {
						decade += 50;
					}
					if ('X' == sDecade.charAt(i)) {
						decade += 10;
					}
				}
			}
			s = s.substring(mDecade.end());
		}
		
		// 1
		int digit = 0;
		if (s.startsWith("IX")) {
			digit = 9;
		} else if (s.startsWith("IV")) {
			digit = 4;
		} else {
			Pattern pDigit = Pattern.compile("V?I*");
			Matcher mDigit = pDigit.matcher(s);
			mDigit.matches();
			if (mDigit.find(0)) {
				String sDigit = s.substring(mDigit.start(), mDigit.end());
				for (int i = 0; i < sDigit.length(); i++) {
					if (0 == i && 'V' == sDigit.charAt(i)) {
						digit += 5;
					}
					if ('I' == sDigit.charAt(i)) {
						digit += 1;
					}
				}
			}
		}
		result = thousand + hundred + decade + digit;
		return result;
	}
	
	
}
