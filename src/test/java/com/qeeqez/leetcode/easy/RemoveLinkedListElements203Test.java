package com.qeeqez.leetcode.easy;

import com.qeeqez.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RemoveLinkedListElements203Test {

    RemoveLinkedListElements203 solution = new RemoveLinkedListElements203();

    @Test
    public void testCase1() {
        int[] head = {1, 2, 6, 3, 4, 5, 6};
        int val = 6;
        ListNode list = ListNode.constructLinkedList(head);

        int[] output = {1, 2, 3, 4, 5};
        ListNode outputList = ListNode.constructLinkedList(output);

        assertTrue(ListNode.isSameList(outputList, solution.removeElements(list, val)));
    }

    @Test
    public void testCase2() {
        int[] head = {};
        int val = 1;
        ListNode list = ListNode.constructLinkedList(head);

        int[] output = {};
        ListNode outputList = ListNode.constructLinkedList(output);

        assertTrue(ListNode.isSameList(outputList, solution.removeElements(list, val)));
    }

    @Test
    public void testCase3() {
        int[] head = {7, 7, 7, 7};
        int val = 7;
        ListNode list = ListNode.constructLinkedList(head);

        int[] output = {};
        ListNode outputList = ListNode.constructLinkedList(output);

        assertTrue(ListNode.isSameList(outputList, solution.removeElements(list, val)));
    }

    @Test
    public void testCase4() {
        int[] head = {7, 7, 7, 7, 8, 9, 10};
        int val = 7;
        ListNode list = ListNode.constructLinkedList(head);

        int[] output = {8, 9, 10};
        ListNode outputList = ListNode.constructLinkedList(output);

        assertTrue(ListNode.isSameList(outputList, solution.removeElements(list, val)));
    }

    @Test
    public void testCase5() {
        int[] head = {7};
        int val = 7;
        ListNode list = ListNode.constructLinkedList(head);

        int[] output = {};
        ListNode outputList = ListNode.constructLinkedList(output);

        assertTrue(ListNode.isSameList(outputList, solution.removeElements(list, val)));
    }
}
