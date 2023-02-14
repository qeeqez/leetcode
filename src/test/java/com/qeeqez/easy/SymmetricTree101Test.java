package com.qeeqez.easy;

import com.qeeqez.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SymmetricTree101Test {

    SymmetricTree101 solution = new SymmetricTree101();

    @Test
    public void testCase1() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3)));

        assertTrue(solution.isSymmetric(root));
    }

    @Test
    public void testCase2() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(3)),
                new TreeNode(2, null, new TreeNode(3)));

        assertFalse(solution.isSymmetric(root));
    }

    @Test
    public void testCase3() {
        TreeNode root = new TreeNode(1);

        assertTrue(solution.isSymmetric(root));
    }

}
