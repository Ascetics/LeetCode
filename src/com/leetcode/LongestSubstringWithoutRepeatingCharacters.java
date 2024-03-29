package com.leetcode;

import java.util.ArrayDeque;
import java.util.Queue;
// 3. Longest Substring Without Repeating Characters
//
// Given a string, find the length of the longest substring without repeating characters.
//
// Example 1:
// Input: "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
//
// Example 2:
// Input: "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
//
// Example 3:
// Input: "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

public class LongestSubstringWithoutRepeatingCharacters {
  public static void main(String[] args) {
    LongestSubstringWithoutRepeatingCharacters s = new LongestSubstringWithoutRepeatingCharacters();
    int len = s.lengthOfLongestSubstring(" ");
    System.out.println(len);
  }

  public int lengthOfLongestSubstring(String s) {
    Queue<Character> q = new ArrayDeque<>();
    char[] cs = s.toCharArray();
    int len = 0;
    for (int i = 0; i < cs.length; i++) {
      if (q.contains(cs[i])) {
        while ((q.remove()) != cs[i]) {
        }
      }
      q.add(cs[i]);
      if (len <= q.size()) {
        len = q.size();
      }
    }
    return len;
  }
}
