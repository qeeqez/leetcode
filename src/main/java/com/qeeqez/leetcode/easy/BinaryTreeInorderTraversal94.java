package com.qeeqez.leetcode.easy;

import com.qeeqez.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 94. Binary Tree Inorder Traversal
 * <p>
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 */
public class BinaryTreeInorderTraversal94 {

    private final List<Integer> values = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return values;


        if (root.left != null) inorderTraversal(root.left);
        values.add(root.val);
        if (root.right != null) inorderTraversal(root.right);

        return values;
    }
}

