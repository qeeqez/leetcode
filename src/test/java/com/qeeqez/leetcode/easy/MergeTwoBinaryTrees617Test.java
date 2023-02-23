package com.qeeqez.leetcode.easy;

import com.qeeqez.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MergeTwoBinaryTrees617Test {

    MergeTwoBinaryTrees617 solution = new MergeTwoBinaryTrees617();

    @Test
    public void testCase1() {
        TreeNode root1 = new TreeNode(1, new TreeNode(3, new TreeNode(5), null), new TreeNode(2));
        TreeNode root2 = new TreeNode(2, new TreeNode(1, null, new TreeNode(4)), new TreeNode(3, null, new TreeNode(7)));

        TreeNode output = new TreeNode(3,
                new TreeNode(4, new TreeNode(5), new TreeNode(4)),
                new TreeNode(5, null, new TreeNode(7)));

        assertTrue(TreeNode.isSameTree(output, solution.mergeTrees(root1, root2)));
    }

    @Test
    public void testCase2() {
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(1, new TreeNode(2), null);

        TreeNode output = new TreeNode(2, new TreeNode(2), null);

        assertTrue(TreeNode.isSameTree(output, solution.mergeTrees(root1, root2)));
    }

    @Test
    public void testCase3() {
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(1);

        TreeNode output = new TreeNode(2);

        assertTrue(TreeNode.isSameTree(output, solution.mergeTrees(root1, root2)));
    }
}
