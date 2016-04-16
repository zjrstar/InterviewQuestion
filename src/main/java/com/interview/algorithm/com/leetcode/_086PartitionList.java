package com.interview.algorithm.com.leetcode;

/**
 * Created by Jerry on 4/16/16.
 */
public class _086PartitionList {

    public ListNode partition(ListNode head, int x) {
        if ( head == null || head.next == null ) return head;
        ListNode leftHead = new ListNode(0);
        ListNode leftTail = leftHead;
        ListNode rightHead = new ListNode(0);
        ListNode rightTail = rightHead;
        ListNode p = head;
        while ( p != null ) {
            if ( p.val < x ) {
                leftTail.next = p;
                leftTail = p;
            } else {
                rightTail.next = p;
                rightTail = p;
            }
            p = p.next;
        }
        p = leftTail;
        p.next = rightHead.next;
        rightTail.next = null;
        return leftHead.next;
    }
}
