package com.qeeqez.easy;

import com.qeeqez.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 144. Binary Tree Preorder Traversal
 * <p>
 * Given the root of a binary tree, return the preorder traversal of its nodes' values.
 */
public class BinaryTreePreorderTraversal144 {

    private final List<Integer> values = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return values;

        values.add(root.val);

        if (root.left != null) preorderTraversal(root.left);
        if (root.right != null) preorderTraversal(root.right);

        return values;
    }
}

