package com.qeeqez.easy;

import com.qeeqez.utils.ListNode;

/**
 * 206. Reverse Linked List
 * <p>
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 */
public class ReverseLinkedList206 {

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        ListNode previous = null;
        ListNode current = head;

        while (current != null) {
            head = current.next;
            current.next = previous;
            previous = current;
            current = head;
        }
        return previous;
    }
}

