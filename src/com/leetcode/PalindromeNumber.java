package com.leetcode;

// 9. Palindrome Number
//
// Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same
// backward as forward.
//
// Example 1:
//
// Input: 121
// Output: true
// Example 2:
//
// Input: -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it
// is not a palindrome.
// Example 3:
//
// Input: 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

public class PalindromeNumber {

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

