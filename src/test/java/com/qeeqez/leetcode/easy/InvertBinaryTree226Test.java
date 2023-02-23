package com.qeeqez.leetcode.easy;

import com.qeeqez.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class InvertBinaryTree226Test {

    InvertBinaryTree226 solution = new InvertBinaryTree226();

    @Test
    public void testCase1() {
        TreeNode root = TreeNode.buildTree(new Integer[]{4, 2, 7, 1, 3, 6, 9});
        TreeNode output = TreeNode.buildTree(new Integer[]{4, 7, 2, 9, 6, 3, 1});

        assertTrue(TreeNode.isSameTree(output, solution.invertTree(root)));
    }

    @Test
    public void testCase2() {
        TreeNode root = TreeNode.buildTree(new Integer[]{4, 2, 7, 1, 3, null, 9});
        TreeNode output = TreeNode.buildTree(new Integer[]{4, 7, 2, 9, null, 3, 1});

        assertTrue(TreeNode.isSameTree(output, solution.invertTree(root)));
    }

    @Test
    public void testCase3() {
        TreeNode root = TreeNode.buildTree(new Integer[]{2, 1, 3});
        TreeNode output = TreeNode.buildTree(new Integer[]{2, 3, 1});

        assertTrue(TreeNode.isSameTree(output, solution.invertTree(root)));
    }

    @Test
    public void testCase4() {
        assertTrue(TreeNode.isSameTree(null, solution.invertTree(null)));
    }
}
