package com.qeeqez.leetcode.easy;

import com.qeeqez.leetcode.utils.ListNode;

/**
 * 203. Remove Linked List Elements
 * <p>
 * Given the head of a linked list and an integer val,
 * remove all the nodes of the linked list that has Node.val == val,
 * and return the new head.
 */
public class RemoveLinkedListElements203 {

    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }

        if (head == null) return null;

        ListNode current = head;

        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

}

