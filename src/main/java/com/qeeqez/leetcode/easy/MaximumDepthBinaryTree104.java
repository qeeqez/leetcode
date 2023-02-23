package com.qeeqez.leetcode.easy;

import com.qeeqez.leetcode.utils.TreeNode;

/**
 * 104. Maximum Depth of Binary Tree
 * <p>
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 */
public class MaximumDepthBinaryTree104 {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }

}

