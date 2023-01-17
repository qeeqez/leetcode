package com.qeeqez.easy;

import com.qeeqez.utils.ListNode;

/**
 * 83. Remove Duplicates from Sorted List
 * <p>
 * Given the head of a sorted linked list,
 * delete all duplicates such that each element appears only once. Return the linked list sorted as well.
 */
public class RemoveDuplicatesFromSortedList83 {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode current = head;

        while (current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}

