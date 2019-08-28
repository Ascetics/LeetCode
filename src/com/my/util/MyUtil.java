package com.my.util;

public class MyUtil {

  /**
   * @param args
   */
  public static void main(String[] args) {

  }


  public static boolean isEmpty(String s) {
    return s == null || "".equals(s);
  }

  public static void print(String s) {
    System.out.println(s);
  }

  public static void print(String[] strs) {
    if (strs == null || strs.length == 0) {
      return;
    }
    for (int i = 0; i < strs.length; i++) {
      System.out.print(strs[i] + " ");
    }
    System.out.println();
  }


  public static void print(int i) {
    System.out.println(i);
  }

  public static void print(int[] nums) {
    if (nums == null || nums.length == 0) {
      return;
    }
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
    System.out.println();
  }

  public static void print(boolean b) {
    System.out.println(b);
  }

  public static void print(char c) {
    System.out.println(c);
  }
}
