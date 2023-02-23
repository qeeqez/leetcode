package com.qeeqez.leetcode.medium;

import com.qeeqez.leetcode.utils.ListNode;

/**
 * 19. Remove Nth Node From End of List
 * <p>
 * Given the head of a linked list, remove the nth node from the end of the list
 * and return its head.
 */
public class RemoveNthNodeFromEndOfList19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = countNodes(head);
        ListNode firstNode = count == n ? head.next : head;

        while (head != null && head.next != null) {
            if (count == n + 1) {
                head.next = head.next.next;
            }
            head = head.next;
            count--;
        }

        return firstNode;
    }

    private int countNodes(ListNode head) {
        int count = 1;
        while (head.next != null) {
            count++;
            head = head.next;
        }
        return count;
    }

}

