package com.qeeqez.leetcode.easy;

import com.qeeqez.leetcode.utils.TreeNode;

/**
 * 404. Sum of Left Leaves
 * <p>
 * Given the root of a binary tree, return the sum of all left leaves.
 * <p>
 * A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.
 */
public class SumOfLeftLeaves404 {

    // 100% CPU
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if (root.left != null) {
            if (isLeaf(root.left)) sum += root.left.val;
            else sum += sumOfLeftLeaves(root.left);
        }
        if (root.right != null) sum += sumOfLeftLeaves(root.right);

        return sum;
    }

    private boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }

}

