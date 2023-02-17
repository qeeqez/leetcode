package com.qeeqez.medium;

import com.qeeqez.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidateBinarySearchTree98Test {

    ValidateBinarySearchTree98 solution = new ValidateBinarySearchTree98();

    @Test
    public void testCase1() {
        TreeNode root = TreeNode.buildTree(new Integer[]{2, 1, 3});
        assertTrue(solution.isValidBST(root));
    }

    @Test
    public void testCase2() {
        TreeNode root = TreeNode.buildTree(new Integer[]{5, 1, 4, null, null, 3, 6});
        assertFalse(solution.isValidBST(root));
    }

    @Test
    public void testCase3() {
        TreeNode root = TreeNode.buildTree(new Integer[]{5, 4, 6, null, null, 3, 7});
        assertFalse(solution.isValidBST(root));
    }
}
