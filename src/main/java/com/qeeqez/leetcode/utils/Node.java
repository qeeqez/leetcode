package com.qeeqez.leetcode.utils;

public class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node left, Node right, Node next) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.next = next;
    }

    public static Node buildTree(Integer[] values) {
        Node root = new Node(values[0]);
        formTree(root, 0, values);
        return root;
    }

    private static void formTree(Node root, int rootIndex, Integer[] values) {
        int n = values.length;

        int leftIndex = 2 * rootIndex + 1;
        if (leftIndex < n && null != values[leftIndex]) {
            root.left = new Node(values[leftIndex]);
            formTree(root.left, leftIndex, values);
        }

        int rightIndex = 2 * rootIndex + 2;
        if (rightIndex < n && null != values[rightIndex]) {
            root.right = new Node(values[rightIndex]);
            formTree(root.right, rightIndex, values);
        }
    }

    /**
     * Returns true if two trees are the same.
     *
     * @param p Node 1
     * @param q Node 2
     * @return true if two trees are the same
     */
    public static boolean isSameLinkTree(Node p, Node q) {
        if (p == null && q == null) {
            return true;
        } else if (p != null && q != null) {
            return p.val == q.val && isSameLinkTree(p.left, q.left)
                    && isSameLinkTree(p.right, q.right)
                    && isSameLinkTree(p.next, q.next);
        } else {
            return false;
        }
    }
}
