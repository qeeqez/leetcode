package com.qeeqez.medium;

import com.qeeqez.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RemoveNthNodeFromEndOfList19Test {

    RemoveNthNodeFromEndOfList19 solution = new RemoveNthNodeFromEndOfList19();

    @Test
    public void testCase1() {
        int[] head = {1, 2, 3, 4, 5};
        ListNode list = ListNode.constructLinkedList(head);

        int n = 2;

        int[] outNums = {1, 2, 3, 5};
        ListNode output = ListNode.constructLinkedList(outNums);

        assertTrue(ListNode.isSameList(output, solution.removeNthFromEnd(list, n)));
    }

    @Test
    public void testCase2() {
        int[] head = {1};
        ListNode list = ListNode.constructLinkedList(head);

        int n = 1;

        int[] outNums = {};
        ListNode output = ListNode.constructLinkedList(outNums);

        assertTrue(ListNode.isSameList(output, solution.removeNthFromEnd(list, n)));
    }

    @Test
    public void testCase3() {
        int[] head = {1, 2};
        ListNode list = ListNode.constructLinkedList(head);

        int n = 1;

        int[] outNums = {1};
        ListNode output = ListNode.constructLinkedList(outNums);

        assertTrue(ListNode.isSameList(output, solution.removeNthFromEnd(list, n)));
    }

    @Test
    public void testCase4() {
        int[] head = {1, 2, 3, 4, 5};
        ListNode list = ListNode.constructLinkedList(head);

        int n = 5;

        int[] outNums = {2, 3, 4, 5};
        ListNode output = ListNode.constructLinkedList(outNums);

        assertTrue(ListNode.isSameList(output, solution.removeNthFromEnd(list, n)));
    }

}
