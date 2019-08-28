package com.leetcode;

// 7. Reverse Integer
//
// Given a 32-bit signed integer, reverse digits of an integer.
//
// Example 1:
//
// Input: 123
// Output: 321
// Example 2:
//
// Input: -123
// Output: -321
// Example 3:
//
// Input: 120
// Output: 21

public class ReverseInteger {

  public static void main(String[] args) {
    ReverseInteger s = new ReverseInteger();

    System.out.println(s.reverse(Integer.MIN_VALUE));
    // System.out.println(s.reverse(Integer.MAX_VALUE));
    // System.out.println(s.reverse(0));
    // System.out.println(s.reverse(1));
    // System.out.println(s.reverse(1007));
    // System.out.println(s.reverse(Integer.MAX_VALUE - 1));
    // System.out.println(s.reverse(123));
    // System.out.println(s.reverse(-123));
    // System.out.println(s.reverse(120));
  }

  public int reverse(int x) {
    boolean isNegative = false;
    if (x < 0) {
      isNegative = true;
    }
    int absX = Math.abs(x);
    if (absX == Integer.MIN_VALUE) {
      return 0;
    }
    StringBuilder sbuf = new StringBuilder(String.valueOf(absX));
    String reverseStrAbsX = sbuf.reverse().toString();
    String strMaxValue = String.valueOf(Integer.MAX_VALUE);
    if ((reverseStrAbsX.length() >= strMaxValue.length())
        && reverseStrAbsX.compareTo(strMaxValue) > 0) {
      return 0;
    }
    int reverseAbsX = Integer.parseInt(reverseStrAbsX);
    return isNegative ? -reverseAbsX : reverseAbsX;
  }
}

