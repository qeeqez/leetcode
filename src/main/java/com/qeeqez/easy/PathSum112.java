package com.qeeqez.easy;

import com.qeeqez.utils.TreeNode;

/**
 * 112. Path Sum
 * <p>
 * Given the root of a binary tree and an integer targetSum,
 * return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
 * <p>
 * A leaf is a node with no children.
 */
public class PathSum112 {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        targetSum -= root.val;
        if (root.left == null && root.right == null) return targetSum == 0;

        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }

}

