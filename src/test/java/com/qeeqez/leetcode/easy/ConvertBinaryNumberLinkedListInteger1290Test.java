package com.qeeqez.leetcode.easy;

import com.qeeqez.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertBinaryNumberLinkedListInteger1290Test {

    ConvertBinaryNumberLinkedListInteger1290 solution = new ConvertBinaryNumberLinkedListInteger1290();

    @Test
    public void testCase1() {
        int[] head = {1, 0, 1};
        ListNode list = ListNode.constructLinkedList(head);

        int output = 5;

        assertEquals(output, solution.getDecimalValue(list));
    }

    @Test
    public void testCase2() {
        ListNode list = new ListNode(0);
        int output = 0;

        assertEquals(output, solution.getDecimalValue(list));
    }

    @Test
    public void testCase3() {
        int[] head = {1, 0, 0, 0, 0, 0, 0, 0};
        ListNode list = ListNode.constructLinkedList(head);

        int output = 128;

        assertEquals(output, solution.getDecimalValue(list));
    }

}
