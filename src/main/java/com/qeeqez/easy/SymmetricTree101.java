package com.qeeqez.easy;

import com.qeeqez.utils.TreeNode;

/**
 * 101. Symmetric Tree
 * <p>
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 */
public class SymmetricTree101 {

    public boolean isSymmetric(TreeNode root) {
        return treeTraversal(root.left, root.right);
    }

    private boolean treeTraversal(TreeNode rootL, TreeNode rootR) {
        if (rootL != null && rootR != null && rootL.val == rootR.val) {
            return treeTraversal(rootL.left, rootR.right) &&
                    treeTraversal(rootL.right, rootR.left);
        } else {
            return rootL == null && rootR == null;
        }
    }

}

