package com.qeeqez.leetcode.easy;

import com.qeeqez.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfLeftLeaves404Test {

    SumOfLeftLeaves404 solution = new SumOfLeftLeaves404();

    @Test
    public void testCase1() {
        TreeNode root = TreeNode.buildTree(new Integer[]{3, 9, 20, null, null, 15, 7});
        int output = 24;

        assertEquals(output, solution.sumOfLeftLeaves(root));
    }

    @Test
    public void testCase2() {
        TreeNode root = new TreeNode(1);
        int output = 0;

        assertEquals(output, solution.sumOfLeftLeaves(root));
    }

}
