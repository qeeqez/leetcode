package com.qeeqez.leetcode.medium;

import com.qeeqez.leetcode.utils.Node;

/**
 * 116. Populating Next Right Pointers in Each Node
 * <p>
 * You are given a perfect binary tree where all leaves are on the same level, and every parent has two children. The binary tree has the following definition:
 * <p>
 * struct Node {
 * int val;
 * Node *left;
 * Node *right;
 * Node *next;
 * }
 * <p>
 * Populate each next pointer to point to its next right node.
 * If there is no next right node, the next pointer should be set to NULL.
 * <p>
 * Initially, all next pointers are set to NULL.
 */
public class PopulatingNextRightPointersEachNode116 {

    // 100% CPU, 62% MEM
    public Node connect(Node root) {
        if (root == null) return null;
        if (root.left != null) root.left.next = root.right;
        if (root.right != null && root.next != null) root.right.next = root.next.left;
        connect(root.left);
        connect(root.right);
        return root;
    }

    // 60% CPU, 62% MEM
    public Node connectSlow(Node root) {
        if (root == null) return null;
        if (root.left == null) return root;
        treeTraversal(root.left, root.right);
        return root;
    }

    private void treeTraversal(Node rootL, Node rootR) {
        if (rootL != null && rootR != null) {
            rootL.next = rootR;
            treeTraversal(rootL.left, rootL.right);
            treeTraversal(rootL.right, rootR.left);
            treeTraversal(rootR.left, rootR.right);
        }
    }

}

