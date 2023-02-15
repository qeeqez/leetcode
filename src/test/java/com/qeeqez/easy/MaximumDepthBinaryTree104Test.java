package com.qeeqez.easy;

import com.qeeqez.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumDepthBinaryTree104Test {

    MaximumDepthBinaryTree104 solution = new MaximumDepthBinaryTree104();

    @Test
    public void testCase1() {
        TreeNode root = TreeNode.buildTree(new Integer[]{
                3, 9, 20, null, null, 15, 7
        });

        int maxDepth = 3;

        assertEquals(maxDepth, solution.maxDepth(root));
    }

    @Test
    public void testCase2() {
        TreeNode root = TreeNode.buildTree(new Integer[]{
                1, null, 2
        });

        int maxDepth = 2;

        assertEquals(maxDepth, solution.maxDepth(root));
    }

}
