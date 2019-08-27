package com.leetcode;

import java.util.Stack;

import com.my.util.MyUtil;

public class ValidParentheses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ValidParentheses s = new ValidParentheses();
//		String s1 = "()";
//		MyUtil.print(s.isValid(s1));
		
		String[] strs = new String[]{"()", "()[]{}", "(]", "([)]", "{[]}", ""};
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
