package com.qeeqez.medium;

import com.qeeqez.utils.TreeNode;

/**
 * 701. Insert into a Binary Search Tree
 * <p>
 * You are given the root node of a binary search tree (BST) and a value to insert into the tree.
 * Return the root node of the BST after the insertion.
 * It is guaranteed that the new value does not exist in the original BST.
 * <p>
 * Notice that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion.
 * You can return any of them.
 */
public class InsertIntoBinarySearchTree701 {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode first = root;
        if (root == null) return new TreeNode(val);
        while (root.val != val) {
            if (root.val < val) {
                if (root.right == null) root.right = new TreeNode(val);
                else root = root.right;
            } else {
                if (root.left == null) root.left = new TreeNode(val);
                else root = root.left;
            }
        }
        return first;
    }

}

