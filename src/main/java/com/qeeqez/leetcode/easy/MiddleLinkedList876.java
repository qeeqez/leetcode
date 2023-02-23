package com.qeeqez.leetcode.easy;

import com.qeeqez.leetcode.utils.ListNode;

/**
 * 876. Middle of the Linked List
 * <p>
 * Given the head of a singly linked list, return the middle node of the linked list.
 * <p>
 * If there are two middle nodes, return the second middle node.
 */
public class MiddleLinkedList876 {

    public ListNode middleNode(ListNode head) {
        int middle = 0;
        ListNode temp = head;

        while (head.next != null) {
            middle++;
            head = head.next;
        }

        middle = middle % 2 == 0 ? middle / 2 : middle / 2 + 1;
        for (int i = 0; i < middle; i++) {
            temp = temp.next;
        }
        return temp;
    }

}

