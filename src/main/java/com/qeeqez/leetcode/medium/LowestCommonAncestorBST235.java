package com.qeeqez.leetcode.medium;

import com.qeeqez.leetcode.utils.TreeNode;

/**
 * 235. Lowest Common Ancestor of a Binary Search Tree
 * <p>
 * You are given the root node of a binary search tree (BST) and a value to insert into the tree.
 * Return the root node of the BST after the insertion.
 * It is guaranteed that the new value does not exist in the original BST.
 * <p>
 * Notice that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion.
 * You can return any of them.
 */
public class LowestCommonAncestorBST235 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root != null) {
            if (root.val > p.val && root.val > q.val) return lowestCommonAncestor(root.left, p, q);
            else if (root.val < p.val && root.val < q.val) return lowestCommonAncestor(root.right, p, q);
        }

        return root;
    }

}

