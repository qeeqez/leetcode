package com.qeeqez.leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// Definition for Node
class Node {
    public int val;
    public List<Node> children;

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

/**
 * 589. N-ary Tree Preorder Traversal
 * <p>
 * Given the root of an n-ary tree, return the preorder traversal of its nodes' values.
 * <p>
 * Nary-Tree input serialization is represented in their level order traversal.
 * Each group of children is separated by the null value (See examples)
 */
public class NaryTreePreorderTraversal589 {

    // 40% CPU, 45% MEM - 2ms
    public List<Integer> preorderRecursiveOptimized(Node root) {
        List<Integer> order = new ArrayList<>();
        traverse(root, order);
        return order;
    }

    private void traverse(Node root, List<Integer> list) {
        if (root == null) return;

        list.add(root.val);
        root.children.forEach(child -> traverse(child, list));
    }


    // 27% CPU, 45% MEM - 3ms
    public List<Integer> preorderRecursive(Node root) {
        List<Integer> order = new ArrayList<>();
        if (root == null) return order;

        order.add(root.val);
        root.children.forEach(child -> order.addAll(preorderRecursive(child)));

        return order;
    }

    // 27% CPU, 45% MEM - 3ms
    public List<Integer> preorderIterative(Node root) {
        List<Integer> order = new ArrayList<>();
        if (root == null) return order;

        Stack<Node> st = new Stack<>();
        st.push(root);

        while (!st.isEmpty()) {
            Node node = st.pop();
            order.add(node.val);

            for (int i = node.children.size() - 1; i >= 0; i--) {
                Node child = node.children.get(i);
                st.push(child);
            }
        }

        return order;
    }

}

