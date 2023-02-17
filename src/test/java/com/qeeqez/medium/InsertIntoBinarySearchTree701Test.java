package com.qeeqez.medium;

import com.qeeqez.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class InsertIntoBinarySearchTree701Test {

    InsertIntoBinarySearchTree701 solution = new InsertIntoBinarySearchTree701();

    @Test
    public void testCase1() {
        TreeNode root = TreeNode.buildTree(new Integer[]{4, 2, 7, 1, 3});
        int val = 5;
        TreeNode output = TreeNode.buildTree(new Integer[]{4, 2, 7, 1, 3, 5});

        assertTrue(TreeNode.isSameTree(output, solution.insertIntoBST(root, val)));
    }

    @Test
    public void testCase2() {
        TreeNode root = TreeNode.buildTree(new Integer[]{40, 20, 60, 10, 30, 50, 70});
        int val = 25;
        TreeNode output = TreeNode.buildTree(new Integer[]{40, 20, 60, 10, 30, 50, 70, null, null, 25});

        assertTrue(TreeNode.isSameTree(output, solution.insertIntoBST(root, val)));
    }

    @Test
    public void testCase3() {
        TreeNode root = TreeNode.buildTree(new Integer[]{4, 2, 7, 1, 3, null, null, null, null, null, null});
        int val = 5;
        TreeNode output = TreeNode.buildTree(new Integer[]{4, 2, 7, 1, 3, 5});

        assertTrue(TreeNode.isSameTree(output, solution.insertIntoBST(root, val)));
    }

    @Test
    public void testCase4() {
        int val = 5;
        TreeNode output = new TreeNode(5);

        assertTrue(TreeNode.isSameTree(output, solution.insertIntoBST(null, val)));
    }

}
