package com.interview.algorithm.com.leetcode;

/**
 * Created by Jerry on 4/16/16.
 */
public class _243PalindromeLinkedList {

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

    public boolean isPalindrome(ListNode head) {
        if ( head == null || head.next == null ) return true;
        int n = lengthOfList(head);
        int half = n / 2;
        ListNode leftEnd = head;
        for ( int i = 0; i < half - 1; i++ ) {
            leftEnd = leftEnd.next;
        }
        ListNode rightStart = leftEnd.next;
        if ( n % 2 != 0 ) {
            rightStart = rightStart.next;
        }
        rightStart = reserverList(rightStart);
        ListNode leftStart = head;
        for ( int i = 1; i <= half; i++ ) {
            if ( leftStart.val != rightStart.val ) return false;
            leftStart = leftStart.next;
            rightStart = rightStart.next;
        }
        return true;
    }


    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(0, new ListNode(1, new ListNode(1))));
        _243PalindromeLinkedList solution = new _243PalindromeLinkedList();
        System.out.println(solution.isPalindrome(node));
    }
}
