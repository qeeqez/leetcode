package com.qeeqez.medium;

import com.qeeqez.utils.TreeNode;

/**
 * 98. Validate Binary Search Tree
 * <p>
 * You are given the root node of a binary search tree (BST) and a value to insert into the tree.
 * Return the root node of the BST after the insertion.
 * It is guaranteed that the new value does not exist in the original BST.
 * <p>
 * Notice that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion.
 * You can return any of them.
 */
public class ValidateBinarySearchTree98 {

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, long min, long max) {
        if (root == null) return true;
        if (root.val >= max || root.val <= min) return false;

        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
    }

}

