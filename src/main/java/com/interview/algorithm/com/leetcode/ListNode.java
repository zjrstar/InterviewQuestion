package com.interview.algorithm.com.leetcode;

/**
 * Created by Jerry on 4/16/16.
 */
public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) { val = x; }

    ListNode(int x, ListNode next) {
        this(x);
        this.next = next;
    }
}