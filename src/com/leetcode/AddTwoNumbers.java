package com.leetcode;

// 2. Add Two Numbers
//
// You are given two non-empty linked lists representing two non-negative integers. The digits are
// stored in reverse order and each of their nodes contain a single digit. Add the two numbers and
// return it as a linked list.
//
// You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
// Example:
//
// Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
// Output: 7 -> 0 -> 8
// Explanation: 342 + 465 = 807.



public class AddTwoNumbers {

  public static void main(String[] args) {
    ListNode l0 = new ListNode(0);

    ListNode l1 = new ListNode(2);
    ListNode t1 = new ListNode(4);
    l1.next = t1;
    ListNode t = new ListNode(3);
    t1.next = t;
    t1 = t;
    print(l1);

    ListNode l2 = new ListNode(5);
    ListNode t2 = new ListNode(6);
    l2.next = t2;
    t = new ListNode(7);
    t2.next = t;
    t2 = t;
    print(l2);

    AddTwoNumbers atn = new AddTwoNumbers();
    print(atn.addTwoNumbers(l0, l1));
    print(atn.addTwoNumbers(l2, l0));
    print(atn.addTwoNumbers(l1, l2));

  }

  public static class ListNode {
    int val;
    ListNode next;

    public ListNode(int x) {
      val = x;
    }
  }

  public static void print(ListNode list) {
    while (list != null) {
      System.out.print(list.val);
      list = list.next;
      if (list != null) {
        System.out.print("->");
      }
    }
    System.out.println();
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode sumNode = null;
    ListNode curNode = null;
    int sum = 0;
    int carry = 0;
    while (l1 != null || l2 != null) {
      if (l1 != null && l2 == null) {
        sum = l1.val + carry;
      } else if (l1 == null && l2 != null) {
        sum = l2.val + carry;
      } else {
        sum = l1.val + l2.val + carry;
      }
      carry = sum / 10;
      sum = sum % 10;
      if (sumNode == null) {
        sumNode = new ListNode(sum);
        curNode = sumNode;
      } else {
        ListNode tmpNode = new ListNode(sum);
        curNode.next = tmpNode;
        curNode = tmpNode;
      }
      if (l1 != null) {
        l1 = l1.next;
      }
      if (l2 != null) {
        l2 = l2.next;
      }
    }
    if (carry > 0) {
      ListNode tmpNode = new ListNode(carry);
      curNode.next = tmpNode;
    }
    return sumNode;
  }

}
