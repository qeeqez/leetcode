package com.qeeqez.leetcode.medium;

import com.qeeqez.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeLevelOrderTraversal102Test {

    BinaryTreeLevelOrderTraversal102 solution = new BinaryTreeLevelOrderTraversal102();

    @Test
    public void testCase1() {
        TreeNode root = TreeNode.buildTree(new Integer[]{3, 9, 20, null, null, 15, 7});

        List<List<Integer>> output = List.of(
                List.of(3),
                List.of(9, 20),
                List.of(15, 7)
        );

        assertEquals(output, solution.levelOrder(root));
    }

    @Test
    public void testCase2() {
        TreeNode root = new TreeNode(1);

        List<List<Integer>> output = List.of(List.of(1));

        assertEquals(output, solution.levelOrder(root));
    }

    @Test
    public void testCase3() {
        assertEquals(new ArrayList<>(), solution.levelOrder(null));
    }
}
