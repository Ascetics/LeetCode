package com.leetcode;

import com.my.util.MyUtil;

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
