package com.qeeqez.leetcode.easy;

import com.qeeqez.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 145. Binary Tree Postorder Traversal
 * <p>
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 */
public class BinaryTreePostorderTraversal145 {

    private final List<Integer> values = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) return values;

        if (root.left != null) postorderTraversal(root.left);
        if (root.right != null) postorderTraversal(root.right);
        values.add(root.val);

        return values;
    }
}

