package com.qeeqez.utils;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    /**
     * Whether two trees are the same.
     *
     * @param p TreeNode 1
     * @param q TreeNode 2
     * @return true if two trees are the same.
     */
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            // base case: 1) root is null 2) reaching leaf's child
            return true;
        }
        if (p != null && q != null) {
            return (p.val == q.val && // compare roots' values
                    isSameTree(p.left, q.left) && // compare left subtrees
                    isSameTree(p.right, q.right)); // compare right subtrees
        } else {
            // is only of root is null, return false
            return false;
        }
    }

    /**
     * Level order traversal of tree. Fill empty nodes with "#".
     * e.g.
     * 1
     * \   => [1, #, 2]
     * 2
     */
    public String toString() {
        StringBuilder string = new StringBuilder("[" + val + ", ");
        Queue<TreeNode> curLevel = new LinkedList<>();
        curLevel.add(left);
        curLevel.add(right);
        while (!curLevel.isEmpty()) {
            Queue<TreeNode> nextLevel = new LinkedList<>();
            while (!curLevel.isEmpty()) {
                TreeNode node = curLevel.poll();
                if (node != null) {
                    string.append(node.val).append(", ");
                    nextLevel.add(node.left);
                    nextLevel.add(node.right);
                } else {
                    string.append("#, ");
                }
            }
            curLevel = nextLevel;
        }
        // remove the redundant ", " at the end of String result
        return string.substring(0, string.length() - 2) + "]";
    }
}
