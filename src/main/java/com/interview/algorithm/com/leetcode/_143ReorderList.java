package com.interview.algorithm.com.leetcode;

/**
 * Created by Jerry on 4/16/16.
 */
public class _143ReorderList {

    public int lengthOfList(ListNode head) {
        int k = 0;
        ListNode p = head;
        while ( p != null ) {
            p = p.next;
            k++;
        }
        return k;
    }

    public ListNode reserverList(ListNode head) {
        if ( head == null || head.next == null ) {
            return head;
        } else {
            ListNode pre = head;
            ListNode p = pre.next;
            ListNode next = null;
            while ( p != null ) {
                next = p.next;
                p.next = pre;
                pre = p;
                p = next;
            }
            head.next = null;
            return pre;
        }
    }

    public void reorderList(ListNode head) {
         if (head == null || head.next == null) {
             return;
         }
        int n = lengthOfList(head);
        int half = n / 2;
        if (n % 2 != 0) half++;
        ListNode leftEnd = head;
        for (int i = 1; i < half; i++) {
            leftEnd = leftEnd.next;
        }
        ListNode rightStart = leftEnd.next;
        rightStart = reserverList(rightStart);
        leftEnd.next = null;
        ListNode left = head;
        ListNode right = rightStart;
        boolean flag = true;
        ListNode next = null;
        while ( right != null ) {
            if(flag) {
                next = left.next;
                left.next = right;
                left = next;
            } else {
                next = right.next;
                right.next = left;
                right = next;
            }
            flag = !flag;
        }
    }

    public static void main(String[] arg) {
        ListNode node  = new ListNode(1, new ListNode(2));

        _143ReorderList solution = new _143ReorderList();
        solution.reorderList(node);
    }
}
