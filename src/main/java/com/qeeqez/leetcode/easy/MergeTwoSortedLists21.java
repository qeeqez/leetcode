package com.qeeqez.leetcode.easy;

import com.qeeqez.leetcode.utils.ListNode;

/**
 * 21. Merge Two Sorted Lists
 * <p>
 * You are given the heads of two sorted linked lists list1 and list2.
 * <p>
 * Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Return the head of the merged linked list.
 */
public class MergeTwoSortedLists21 {

    public ListNode mergeTwoListsRecursive(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode output = new ListNode();

        if (list1.val < list2.val) {
            output.val = list1.val;
            list1 = list1.next;
        } else {
            output.val = list2.val;
            list2 = list2.next;
        }

        output.next = mergeTwoListsRecursive(list1, list2);
        return output;
    }

    public ListNode mergeTwoListsIterative(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode head = new ListNode();
        ListNode last = head;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                last.next = list1;
                list1 = list1.next;
            } else {
                last.next = list2;
                list2 = list2.next;
            }
            last = last.next;
        }

        if (list1 == null) {
            last.next = list2;
        } else {
            last.next = list1;
        }

        return head.next;
    }

}

