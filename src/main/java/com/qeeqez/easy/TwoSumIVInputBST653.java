package com.qeeqez.easy;

import com.qeeqez.utils.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 653. Two Sum IV - Input is a BST
 * <p>
 * You are given the root node of a binary search tree (BST) and a value to insert into the tree.
 * Return the root node of the BST after the insertion.
 * It is guaranteed that the new value does not exist in the original BST.
 * <p>
 * Notice that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion.
 * You can return any of them.
 */
public class TwoSumIVInputBST653 {

    private final Set<Integer> values = new HashSet<>();

    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        if (values.contains(k - root.val)) return true;
        values.add(root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }

}

