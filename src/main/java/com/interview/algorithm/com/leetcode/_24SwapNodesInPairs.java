package com.interview.algorithm.com.leetcode;

/**
 * Created by Jerry on 4/16/16.
 */
public class _24SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {
        if ( head == null || head.next == null ) return head;
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode zero = newHead;
        ListNode pre = head;
        ListNode p = pre.next;
        ListNode next = null;
        while(pre != null && p!= null) {
            next = p.next;
            p.next = pre;
            pre.next = next;
            zero.next = p;
            if (next == null) {
                break;
            } else {
                zero = pre;
                pre = next;
                p = pre.next;
            }
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2));

        _24SwapNodesInPairs solution = new _24SwapNodesInPairs();

        solution.swapPairs(node);
    }
}
