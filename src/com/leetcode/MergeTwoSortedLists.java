package com.leetcode;

// 21. Merge Two Sorted Lists
// 
// Merge two sorted linked lists and return it as a new list. The new list should be made by
// splicing together the nodes of the first two lists.
//
// Example:
//
// Input: 1->2->4, 1->3->4
// Output: 1->1->2->3->4->4

public class MergeTwoSortedLists {

  public static void main(String[] args) {
    ListNode nNew = null;
    ListNode nLast = null;

    ListNode l1 = new ListNode(1);
    nLast = l1;
    nNew = new ListNode(2);
    nLast.next = nNew;
    nLast = nNew;
    nNew = new ListNode(3);
    nLast.next = nNew;
    nLast = nNew;
    print(l1);

    ListNode l2 = new ListNode(1);
    nLast = l2;
    nNew = new ListNode(3);
    nLast.next = nNew;
    nLast = nNew;
    nNew = new ListNode(4);
    nLast.next = nNew;
    nLast = nNew;
    print(l2);

    MergeTwoSortedLists s = new MergeTwoSortedLists();
    ListNode merge = s.mergeTwoLists(l1, l2);
    print(merge);
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
      System.out.print(list.val + "->");
      list = list.next;
    }
    System.out.println();
  }

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode merge = null;
    ListNode nLast = null;
    ListNode nNew = null;
    while (l1 != null && l2 != null) {
      if (l1.val <= l2.val) {
        nNew = new ListNode(l1.val);
        if (merge == null) {
          merge = nNew;
        }
        if (nLast != null) {
          nLast.next = nNew;
        }
        nLast = nNew;
        l1 = l1.next;
      } else {
        nNew = new ListNode(l2.val);
        if (merge == null) {
          merge = nNew;
        }
        if (nLast != null) {
          nLast.next = nNew;
        }
        nLast = nNew;
        l2 = l2.next;
      }
    }
    if (l1 == null && l2 != null) {
      while (l2 != null) {
        nNew = new ListNode(l2.val);
        if (merge == null) {
          merge = nNew;
        }
        if (nLast != null) {
          nLast.next = nNew;
        }
        nLast = nNew;
        l2 = l2.next;
      }
    }
    if (l2 == null && l1 != null) {
      while (l1 != null) {
        nNew = new ListNode(l1.val);
        if (merge == null) {
          merge = nNew;
        }
        if (nLast != null) {
          nLast.next = nNew;
        }
        nLast = nNew;
        l1 = l1.next;
      }
    }
    return merge;
  }
}
