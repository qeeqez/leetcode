package com.qeeqez.leetcode.easy;

import com.qeeqez.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PathSum112Test {

    PathSum112 solution = new PathSum112();

    @Test
    public void testCase1() {
        TreeNode root = TreeNode.buildTree(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1});
        int targetSum = 22;

        assertTrue(solution.hasPathSum(root, targetSum));
    }

    @Test
    public void testCase2() {
        TreeNode root = TreeNode.buildTree(new Integer[]{1, 2, 3});
        int targetSum = 5;

        assertFalse(solution.hasPathSum(root, targetSum));
    }

    @Test
    public void testCase3() {
        assertFalse(solution.hasPathSum(null, 0));
    }

    @Test
    public void testCase4() {
        TreeNode root = TreeNode.buildTree(new Integer[]{-2, null, -3});
        int targetSum = -5;

        assertTrue(solution.hasPathSum(root, targetSum));
    }

    @Test
    public void testCase5() {
        TreeNode root = TreeNode.buildTree(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1});
        int targetSum = 22;

        assertTrue(solution.hasPathSum(root, targetSum));
    }

}
