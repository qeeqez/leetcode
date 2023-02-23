package com.qeeqez.leetcode.easy;

import com.qeeqez.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MiddleLinkedList876Test {

    MiddleLinkedList876 solution = new MiddleLinkedList876();

    @Test
    public void testCase1() {
        int[] head = {1, 2, 3, 4, 5};
        ListNode list = ListNode.constructLinkedList(head);

        int[] outNums = {3, 4, 5};
        ListNode output = ListNode.constructLinkedList(outNums);

        assertTrue(ListNode.isSameList(output, solution.middleNode(list)));
    }

    @Test
    public void testCase2() {
        int[] head = {5, 4, 3, 2, 1};
        ListNode list = ListNode.constructLinkedList(head);

        int[] outNums = {3, 2, 1};
        ListNode output = ListNode.constructLinkedList(outNums);

        assertTrue(ListNode.isSameList(output, solution.middleNode(list)));
    }

    @Test
    public void testCase3() {
        int[] head = {1, 2, 3, 4, 5, 6};
        ListNode list = ListNode.constructLinkedList(head);

        int[] outNums = {4, 5, 6};
        ListNode output = ListNode.constructLinkedList(outNums);

        assertTrue(ListNode.isSameList(output, solution.middleNode(list)));
    }

    @Test
    public void testCase4() {
        int[] head = {6, 5, 4, 3, 2, 1};
        ListNode list = ListNode.constructLinkedList(head);

        int[] outNums = {3, 2, 1};
        ListNode output = ListNode.constructLinkedList(outNums);

        assertTrue(ListNode.isSameList(output, solution.middleNode(list)));
    }

}
