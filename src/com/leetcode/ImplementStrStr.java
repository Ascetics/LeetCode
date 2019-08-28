package com.leetcode;

import com.my.util.MyUtil;

// 28. Implement strStr()
//
// Implement strStr().
//
// Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of
// haystack.
//
// Example 1:
//
// Input: haystack = "hello", needle = "ll"
// Output: 2
// Example 2:
//
// Input: haystack = "aaaaa", needle = "bba"
// Output: -1
// Clarification:
//
// What should we return when needle is an empty string? This is a great question to ask during an
// interview.
//
// For the purpose of this problem, we will return 0 when needle is an empty string. This is
// consistent to C's strstr() and Java's indexOf().
//
public class ImplementStrStr {

  public static void main(String[] args) {
    ImplementStrStr s = new ImplementStrStr();

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
