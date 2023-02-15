package com.qeeqez.easy;

import com.qeeqez.utils.TreeNode;

/**
 * 226. Invert Binary Tree
 * <p>
 * Given the root of a binary tree, invert the tree, and return its root.
 */
public class InvertBinaryTree226 {

    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;

            if (root.left != null) invertTree(root.left);
            if (root.right != null) invertTree(root.right);
        }
        return root;
    }

}

