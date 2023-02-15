package com.qeeqez.easy;

import com.qeeqez.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SymmetricTree101Test {

    SymmetricTree101 solution = new SymmetricTree101();

    @Test
    public void testCase1() {
        TreeNode root = TreeNode.buildTree(new Integer[]{1, 2, 2, 3, 4, 4, 3});

        assertTrue(solution.isSymmetric(root));
    }

    @Test
    public void testCase2() {
        TreeNode root = TreeNode.buildTree(new Integer[]{1, 2, 2, null, 3, null, 3});

        assertFalse(solution.isSymmetric(root));
    }

    @Test
    public void testCase3() {
        TreeNode root = new TreeNode(1);

        assertTrue(solution.isSymmetric(root));
    }

}
