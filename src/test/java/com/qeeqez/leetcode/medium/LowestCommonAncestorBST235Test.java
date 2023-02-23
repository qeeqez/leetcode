package com.qeeqez.leetcode.medium;

import com.qeeqez.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LowestCommonAncestorBST235Test {

    LowestCommonAncestorBST235 solution = new LowestCommonAncestorBST235();

    TreeNode zero = new TreeNode(0);
    TreeNode three = new TreeNode(3);
    TreeNode five = new TreeNode(5);
    TreeNode four = new TreeNode(4, three, five);
    TreeNode two = new TreeNode(2, zero, four);
    TreeNode eight = TreeNode.buildTree(new Integer[]{8, 7, 9});
    TreeNode six = new TreeNode(6, two, eight);

    @Test
    public void testCase1() {
        assertEquals(six, solution.lowestCommonAncestor(six, two, eight));
    }

    @Test
    public void testCase2() {
        assertEquals(two, solution.lowestCommonAncestor(six, two, four));
    }

    @Test
    public void testCase3() {
        assertEquals(four, solution.lowestCommonAncestor(six, four, three));
    }

    @Test
    public void testCase4() {
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2, one, null);
        assertEquals(two, solution.lowestCommonAncestor(two, two, one));
    }

}
