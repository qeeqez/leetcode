package com.qeeqez.leetcode.easy;

import com.qeeqez.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListCycle141Test {

    LinkedListCycle141 solution = new LinkedListCycle141();

    @Test
    public void testCase1() {
        int[] head = {3, 2, 0, -4};
        int pos = 1;
        ListNode list = ListNode.constructLinkedListCycled(head, pos);

        assertTrue(solution.hasCycleSlow(list));
        assertTrue(solution.hasCycle(list));
    }

    @Test
    public void testCase2() {
        int[] head = {3, 2, 0, -4, -6};
        int pos = 1;
        ListNode list = ListNode.constructLinkedListCycled(head, pos);

        assertTrue(solution.hasCycleSlow(list));
        assertTrue(solution.hasCycle(list));
    }

    @Test
    public void testCase3() {
        int[] head = {3, 2, 0, -4};
        int pos = -1;
        ListNode list = ListNode.constructLinkedListCycled(head, pos);

        assertFalse(solution.hasCycleSlow(list));
        assertFalse(solution.hasCycle(list));
    }

    @Test
    public void testCase4() {
        int[] head = {3, 2, 0, -4, -6};
        int pos = -1;
        ListNode list = ListNode.constructLinkedListCycled(head, pos);

        assertFalse(solution.hasCycleSlow(list));
        assertFalse(solution.hasCycle(list));
    }

    @Test
    public void testCase5() {
        int[] head = {3, 2, 0, -4, -6, -7};
        int pos = 1;
        ListNode list = ListNode.constructLinkedListCycled(head, pos);

        assertTrue(solution.hasCycleSlow(list));
        assertTrue(solution.hasCycle(list));
    }

    @Test
    public void testCase6() {
        int[] head = {3, 2, 0, -4, -6, -7};
        int pos = -1;
        ListNode list = ListNode.constructLinkedListCycled(head, pos);

        assertFalse(solution.hasCycleSlow(list));
        assertFalse(solution.hasCycle(list));
    }

    @Test
    public void testCase7() {
        int[] head = {1, 2};
        int pos = 0;
        ListNode list = ListNode.constructLinkedListCycled(head, pos);

        assertTrue(solution.hasCycleSlow(list));
        assertTrue(solution.hasCycle(list));
    }

    @Test
    public void testCase8() {
        int[] head = {1};
        int pos = -1;
        ListNode list = ListNode.constructLinkedListCycled(head, pos);

        assertFalse(solution.hasCycleSlow(list));
        assertFalse(solution.hasCycle(list));
    }

    @Test
    public void testCase9() {
        int[] head = {};
        int pos = -1;
        ListNode list = ListNode.constructLinkedListCycled(head, pos);

        assertFalse(solution.hasCycleSlow(list));
        assertFalse(solution.hasCycle(list));
    }
}
