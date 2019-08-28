package com.leetcode;

import com.my.util.MyUtil;

// 38. Count and Say
//
// The count-and-say sequence is the sequence of integers with the first five terms as following:
//
// 1. 1
// 2. 11
// 3. 21
// 4. 1211
// 5. 111221
// 1 is read off as "one 1" or 11.
// 11 is read off as "two 1s" or 21.
// 21 is read off as "one 2, then one 1" or 1211.
//
// Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.
//
// Note: Each term of the sequence of integers will be represented as a string.
//
//
//
// Example 1:
//
// Input: 1
// Output: "1"
// Example 2:
//
// Input: 4
// Output: "1211"
//

public class CountAndSay {

  /**
   * @param args
   */
  public static void main(String[] args) {
    CountAndSay s = new CountAndSay();

    // MyUtil.print(s.countAndSay(2));
    for (int i = 1; i <= 10; i++) {
      MyUtil.print(s.countAndSay(i));
    }
  }

  public String countAndSay(int n) {
    StringBuilder sb = new StringBuilder();
    if (n == 1) {
      return "1";
    } else {
      String cs = countAndSay(n - 1);
      char keyChar = cs.charAt(0);
      int count = 0;
      for (int i = 0; i < cs.length(); i++) {
        if (cs.charAt(i) == keyChar) {
          count++;
        } else {
          sb.append(String.valueOf(count));
          sb.append(keyChar);
          keyChar = cs.charAt(i);
          count = 1;
        }
      }
      sb.append(String.valueOf(count));
      sb.append(keyChar);
    }
    return sb.toString();
  }

}
