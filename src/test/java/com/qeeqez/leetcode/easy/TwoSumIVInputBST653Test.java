package com.qeeqez.leetcode.easy;

import com.qeeqez.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TwoSumIVInputBST653Test {

    TwoSumIVInputBST653 solution = new TwoSumIVInputBST653();

    @Test
    public void testCase1() {
        TreeNode root = TreeNode.buildTree(new Integer[]{5, 3, 6, 2, 4, null, 7});
        int k = 9;
        assertTrue(solution.findTarget(root, k));
    }

    @Test
    public void testCase2() {
        TreeNode root = TreeNode.buildTree(new Integer[]{5, 3, 6, 2, 4, null, 7});
        int k = 28;
        assertFalse(solution.findTarget(root, k));
    }

    @Test
    public void testCase3() {
        TreeNode root = TreeNode.buildTree(new Integer[]{5, 3, 6, 2, 4, null, 7});
        int k = 11;
        assertTrue(solution.findTarget(root, k));
    }

}
