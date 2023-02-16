package com.qeeqez.medium;

import com.qeeqez.utils.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PopulatingNextRightPointersEachNode116Test {

    PopulatingNextRightPointersEachNode116 solution = new PopulatingNextRightPointersEachNode116();

    @Test
    public void testCase1() {
        Node root = Node.buildTree(new Integer[]{1, 2, 3, 4, 5, 6, 7});

        Node seven = new Node(7, null, null, null);
        Node six = new Node(6, null, null, seven);
        Node five = new Node(5, null, null, six);
        Node four = new Node(4, null, null, five);
        Node three = new Node(3, six, seven, null);
        Node two = new Node(2, four, five, three);
        Node one = new Node(1, two, three, null);

        assertTrue(Node.isSameLinkTree(one, solution.connectSlow(root)));
        assertTrue(Node.isSameLinkTree(one, solution.connect(root)));
    }

    @Test
    public void testCase2() {
        assertTrue(Node.isSameLinkTree(null, solution.connectSlow(null)));
        assertTrue(Node.isSameLinkTree(null, solution.connect(null)));
    }

    @Test
    public void testCase3() {
        Node root = new Node(1, null, null, null);
        Node one = new Node(1, null, null, null);

        assertTrue(Node.isSameLinkTree(one, solution.connectSlow(root)));
        assertTrue(Node.isSameLinkTree(one, solution.connect(root)));
    }

}
