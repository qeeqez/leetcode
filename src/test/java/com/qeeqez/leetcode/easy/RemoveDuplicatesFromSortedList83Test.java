package com.qeeqez.leetcode.easy;

import com.qeeqez.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RemoveDuplicatesFromSortedList83Test {

    RemoveDuplicatesFromSortedList83 solution = new RemoveDuplicatesFromSortedList83();

    @Test
    public void testCase1() {
        int[] head = {1, 1, 2};
        ListNode list = ListNode.constructLinkedList(head);

        int[] output = {1, 2};
        ListNode outputList = ListNode.constructLinkedList(output);

        assertTrue(ListNode.isSameList(outputList, solution.deleteDuplicates(list)));
    }

    @Test
    public void testCase2() {
        int[] head = {1, 1, 2, 3, 3};
        ListNode list = ListNode.constructLinkedList(head);

        int[] output = {1, 2, 3};
        ListNode outputList = ListNode.constructLinkedList(output);

        assertTrue(ListNode.isSameList(outputList, solution.deleteDuplicates(list)));
    }

    @Test
    public void testCase3() {
        int[] head = {};
        ListNode list = ListNode.constructLinkedList(head);

        int[] output = {};
        ListNode outputList = ListNode.constructLinkedList(output);

        assertTrue(ListNode.isSameList(outputList, solution.deleteDuplicates(list)));
    }
}
