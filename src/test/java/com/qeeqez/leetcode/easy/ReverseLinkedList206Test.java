package com.qeeqez.leetcode.easy;

import com.qeeqez.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReverseLinkedList206Test {

    ReverseLinkedList206 solution = new ReverseLinkedList206();

    @Test
    public void testCase1() {
        int[] head = {1, 2, 3, 4, 5};
        ListNode list = ListNode.constructLinkedList(head);

        int[] output = {5, 4, 3, 2, 1};
        ListNode outputList = ListNode.constructLinkedList(output);

        assertTrue(ListNode.isSameList(outputList, solution.reverseList(list)));
    }

    @Test
    public void testCase2() {
        int[] head = {1, 2};
        ListNode list = ListNode.constructLinkedList(head);

        int[] output = {2, 1};
        ListNode outputList = ListNode.constructLinkedList(output);

        assertTrue(ListNode.isSameList(outputList, solution.reverseList(list)));
    }

    @Test
    public void testCase3() {
        int[] head = {};
        ListNode list = ListNode.constructLinkedList(head);

        int[] output = {};
        ListNode outputList = ListNode.constructLinkedList(output);

        assertTrue(ListNode.isSameList(outputList, solution.reverseList(list)));
    }
}
