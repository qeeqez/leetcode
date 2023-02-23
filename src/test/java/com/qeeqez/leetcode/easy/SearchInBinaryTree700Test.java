package com.qeeqez.leetcode.easy;

import com.qeeqez.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchInBinaryTree700Test {

    SearchInBinaryTree700 solution = new SearchInBinaryTree700();

    @Test
    public void testCase1() {
        TreeNode root = TreeNode.buildTree(new Integer[]{4, 2, 7, 1, 3});
        int val = 2;
        TreeNode output = TreeNode.buildTree(new Integer[]{2, 1, 3});

        assertTrue(TreeNode.isSameTree(output, solution.searchBSTIterative(root, val)));
        assertTrue(TreeNode.isSameTree(output, solution.searchBST(root, val)));
    }

    @Test
    public void testCase2() {
        TreeNode root = TreeNode.buildTree(new Integer[]{4, 2, 7, 1, 3});
        int val = 5;

        assertTrue(TreeNode.isSameTree(null, solution.searchBSTIterative(root, val)));
        assertTrue(TreeNode.isSameTree(null, solution.searchBST(root, val)));
    }

}
