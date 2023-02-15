package com.qeeqez.easy;

import com.qeeqez.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class InvertBinaryTree226Test {

    InvertBinaryTree226 solution = new InvertBinaryTree226();

    @Test
    public void testCase1() {
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9))
        );

        TreeNode output = new TreeNode(4,
                new TreeNode(7, new TreeNode(9), new TreeNode(6)),
                new TreeNode(2, new TreeNode(3), new TreeNode(1))
        );

        assertTrue(TreeNode.isSameTree(output, solution.invertTree(root)));
    }

    @Test
    public void testCase2() {
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, null, new TreeNode(9))
        );

        TreeNode output = new TreeNode(4,
                new TreeNode(7, new TreeNode(9), null),
                new TreeNode(2, new TreeNode(3), new TreeNode(1))
        );

        assertTrue(TreeNode.isSameTree(output, solution.invertTree(root)));
    }

    @Test
    public void testCase3() {
        TreeNode root = new TreeNode(2,
                new TreeNode(1),
                new TreeNode(3)
        );

        TreeNode output = new TreeNode(2,
                new TreeNode(3),
                new TreeNode(1)
        );

        assertTrue(TreeNode.isSameTree(output, solution.invertTree(root)));
    }

    @Test
    public void testCase4() {
        assertTrue(TreeNode.isSameTree(null, solution.invertTree(null)));
    }
}
