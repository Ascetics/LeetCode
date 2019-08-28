package com.leetcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// 5. Longest Palindromic Substring
//
// Given a string s, find the longest palindromic substring in s. You may assume that the maximum
// length of s is 1000.
//
// Example 1:
//
// Input: "babad"
// Output: "bab"
// Note: "aba" is also a valid answer.
// Example 2:
//
// Input: "cbbd"
// Output: "bb"

public class LongestPalindromicSubstring {

  public static void main(String[] args) {
    LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
    String s = new String("cbbd");
    String rs = lps.longestPalindrome(s);
    System.out.println(rs);
  }

  public String longestPalindrome(String s) {
    int left = 0;
    int right = -1;
    char[] cs = s.toCharArray();
    Set<PalindromeStr> set = new HashSet<>();
    for (int i = 0; i < cs.length; i++) {
      set.add(new PalindromeStr(i, i));
    }
    for (int i = 1; i < cs.length; i++) {
      if (cs[i - 1] == cs[i]) {
        set.add(new PalindromeStr(i - 1, i));
      }
    }
    while (!set.isEmpty()) {
      Iterator<PalindromeStr> iter = set.iterator();
      while (iter.hasNext()) {
        PalindromeStr ps = (PalindromeStr) iter.next();
        if (ps.lp > 0 && ps.rp < cs.length - 1 && cs[ps.lp - 1] == cs[ps.rp + 1]) {
          ps.lp--;
          ps.rp++;
        } else {
          if (ps.rp - ps.lp + 1 >= right - left + 1) {
            left = ps.lp;
            right = ps.rp;
          }
          iter.remove();
        }
      }
    }
    return s.substring(left, right + 1);
  }

  public static class PalindromeStr {
    int lp;
    int rp;

    public PalindromeStr(int lp, int rp) {
      this.lp = lp;
      this.rp = rp;
    }

  }

}
