package com.qeeqez.leetcode.easy;

import com.qeeqez.leetcode.utils.TreeNode;

/**
 * 700. Search in a Binary Search Tree
 * <p>
 * You are given the root of a binary search tree (BST) and an integer val.
 * <p>
 * Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.
 */
public class SearchInBinaryTree700 {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) return root;
        if (root.val > val) return searchBST(root.left, val);
        return searchBST(root.right, val);
    }

    public TreeNode searchBSTIterative(TreeNode root, int val) {
        if (root == null) return null;
        while (root != null && root.val != val) {
            root = val < root.val ? root.left : root.right;
        }
        return root;
    }

}

