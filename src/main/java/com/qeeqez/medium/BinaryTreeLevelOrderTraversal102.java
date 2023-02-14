package com.qeeqez.medium;

import com.qeeqez.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 102. Binary Tree Level Order Traversal
 * <p>
 * Given the root of a binary tree, return the level order traversal of its nodes' values.
 * (i.e., from left to right, level by level).
 */
public class BinaryTreeLevelOrderTraversal102 {

    private final List<List<Integer>> tree = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        treeTraversal(root, 0);
        return tree;
    }

    private void treeTraversal(TreeNode root, int layer) {
        if (root == null) return;

        if (tree.size() <= layer) tree.add(new ArrayList<>());
        tree.get(layer).add(root.val);

        if (root.left != null) treeTraversal(root.left, layer + 1);
        if (root.right != null) treeTraversal(root.right, layer + 1);
    }

}

