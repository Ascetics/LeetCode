package com.leetcode;

import java.util.Stack;

import com.my.util.MyUtil;

// 20. Valid Parentheses
// 
// Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the
// input string is valid.
//
// An input string is valid if:
//
// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Note that an empty string is also considered valid.
//
// Example 1:
//
// Input: "()"
// Output: true
// Example 2:
//
// Input: "()[]{}"
// Output: true
// Example 3:
//
// Input: "(]"
// Output: false
// Example 4:
//
// Input: "([)]"
// Output: false
// Example 5:
//
// Input: "{[]}"
// Output: true

public class ValidParentheses {

  /**
   * @param args
   */
  public static void main(String[] args) {
    ValidParentheses s = new ValidParentheses();
    // String s1 = "()";
    // MyUtil.print(s.isValid(s1));

    String[] strs = new String[] {"()", "()[]{}", "(]", "([)]", "{[]}", ""};
    for (int i = 0; i < strs.length; i++) {
      MyUtil.print(s.isValid(strs[i]));
    }
  }

  // parenthesis()
  // bracket[]
  // brace{}

  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<Character>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if ('(' == c || '[' == c || '{' == c) {
        stack.push(c);
        continue;
      }

      if (')' == c) {
        if (stack.isEmpty() || stack.peek() != '(') {
          return false;
        } else {
          stack.pop();
          continue;
        }
      }

      if (']' == c) {
        if (stack.isEmpty() || stack.peek() != '[') {
          return false;
        } else {
          stack.pop();
          continue;
        }
      }

      if ('}' == c) {
        if (stack.isEmpty() || stack.peek() != '{') {
          return false;
        } else {
          stack.pop();
          continue;
        }
      }
    }
    return stack.isEmpty();
  }

}
