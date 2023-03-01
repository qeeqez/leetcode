package com.qeeqez.leetcode.easy;

import com.qeeqez.leetcode.utils.ListNode;

/**
 * 1290. Convert Binary Number in a Linked List to Integer
 * <p>
 * Given head which is a reference node to a singly-linked list.
 * The value of each node in the linked list is either 0 or 1.
 * The linked list holds the binary representation of a number.
 * <p>
 * Return the decimal value of the number in the linked list.
 * <p>
 * The most significant bit is at the head of the linked list.
 */
public class ConvertBinaryNumberLinkedListInteger1290 {

    // 100% CPU
    public int getDecimalValue(ListNode head) {
        int decimal = 0;

        while (head != null) {
            decimal = (decimal << 1) | head.val;
            head = head.next;
        }

        return decimal;
    }

}

