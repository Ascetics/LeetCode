package com.leetcode;

import com.my.util.MyUtil;

// 14. Longest Common Prefix
// 
// Write a function to find the longest common prefix string amongst an array of strings.
//
// If there is no common prefix, return an empty string "".
//
// Example 1:
//
// Input: ["flower","flow","flight"]
// Output: "fl"
// Example 2:
//
// Input: ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.
// Note:
//
// All given inputs are in lowercase letters a-z.

public class LongestCommonPrefix {


  public static void main(String[] args) {
    LongestCommonPrefix s = new LongestCommonPrefix();

    String[] strs = new String[] {"flow", "flower", "flight"};
    MyUtil.print(s.longestCommonPrefix(strs));

    String[] strs1 = new String[] {"dog", "racecar", "car"};
    MyUtil.print(s.longestCommonPrefix(strs1));

    String[] strs2 = new String[] {"", "", ""};
    MyUtil.print(s.longestCommonPrefix(strs2));

    String[] strs3 = new String[0];
    MyUtil.print(s.longestCommonPrefix(strs3));
  }

  public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) {
      return "";
    }
    int shortestLenth = Integer.MAX_VALUE;
    for (int i = 0; i < strs.length; i++) {
      if (strs[i].length() < shortestLenth) {
        shortestLenth = strs[i].length();
      }
    }
    //
    StringBuilder commonPrefix = new StringBuilder("");
    for (int i = 0; i < shortestLenth; i++) {
      boolean diffChar = false;
      for (int j = 1; j < strs.length; j++) {
        if (strs[j - 1].charAt(i) != strs[j].charAt(i)) {
          diffChar = true;
          break;
        }
      }
      if (diffChar) {
        break;
      }
      commonPrefix.append(strs[0].charAt(i));
    }
    return commonPrefix.toString();
  }
}
