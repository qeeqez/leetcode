package com.qeeqez.easy;

import com.qeeqez.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MergeTwoSortedLists21Test {

    MergeTwoSortedLists21 solution = new MergeTwoSortedLists21();

    @Test
    public void testCase1() {
        // List 1
        int[] listNums1 = {1, 2, 4};
        ListNode list1 = ListNode.constructLinkedList(listNums1);

        // List 2
        int[] listNums2 = {1, 3, 4};
        ListNode list2 = ListNode.constructLinkedList(listNums2);

        // Output
        int[] outNums = {1, 1, 2, 3, 4, 4};
        ListNode output = ListNode.constructLinkedList(outNums);

        assertTrue(ListNode.isSameList(output, solution.mergeTwoListsRecursive(list1, list2)));
        assertTrue(ListNode.isSameList(output, solution.mergeTwoListsIterative(list1, list2)));
    }

    @Test
    public void testCase2() {
        assertTrue(ListNode.isSameList(null, solution.mergeTwoListsRecursive(null, null)));
        assertTrue(ListNode.isSameList(null, solution.mergeTwoListsIterative(null, null)));
    }

    @Test
    public void testCase3() {
        ListNode input = new ListNode(0);
        ListNode output = new ListNode(0);
        assertTrue(ListNode.isSameList(output, solution.mergeTwoListsRecursive(null, input)));
        assertTrue(ListNode.isSameList(output, solution.mergeTwoListsIterative(null, input)));
    }

}
