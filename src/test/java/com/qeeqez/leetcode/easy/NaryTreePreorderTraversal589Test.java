package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NaryTreePreorderTraversal589Test {

    NaryTreePreorderTraversal589 solution = new NaryTreePreorderTraversal589();

    @Test
    public void testCase1() {
        Node six = new Node(6, new ArrayList<>());
        Node five = new Node(5, new ArrayList<>());
        Node three = new Node(3, List.of(five, six));
        Node four = new Node(4, new ArrayList<>());
        Node two = new Node(2, new ArrayList<>());
        Node one = new Node(1, List.of(three, two, four));

        List<Integer> output = List.of(1, 3, 5, 6, 2, 4);

        assertEquals(output, solution.preorderIterative(one));
        assertEquals(output, solution.preorderRecursive(one));
        assertEquals(output, solution.preorderRecursiveOptimized(one));
    }

    @Test
    public void testCase2() {
        Node node10 = new Node(10, new ArrayList<>());
        Node node13 = new Node(13, new ArrayList<>());
        Node node9 = new Node(9, List.of(node13));
        Node node5 = new Node(5, List.of(node9, node10));

        Node node12 = new Node(12, new ArrayList<>());
        Node node8 = new Node(8, List.of(node12));
        Node node4 = new Node(4, List.of(node8));

        Node node14 = new Node(14, new ArrayList<>());
        Node node11 = new Node(11, List.of(node14));
        Node node7 = new Node(7, List.of(node11));
        Node node6 = new Node(6, new ArrayList<>());
        Node node3 = new Node(3, List.of(node6, node7));

        Node node2 = new Node(2, new ArrayList<>());

        Node one = new Node(1, List.of(node2, node3, node4, node5));

        List<Integer> output = List.of(1, 2, 3, 6, 7, 11, 14, 4, 8, 12, 5, 9, 13, 10);

        assertEquals(output, solution.preorderIterative(one));
        assertEquals(output, solution.preorderRecursive(one));
        assertEquals(output, solution.preorderRecursiveOptimized(one));
    }

    @Test
    public void testCase3() {
        assertEquals(new ArrayList<>(), solution.preorderIterative(null));
        assertEquals(new ArrayList<>(), solution.preorderRecursive(null));
        assertEquals(new ArrayList<>(), solution.preorderRecursiveOptimized(null));
    }

}
