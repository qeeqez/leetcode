package com.qeeqez.easy;

import com.qeeqez.utils.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeInorderTraversal94Test {

    BinaryTreeInorderTraversal94 solution = new BinaryTreeInorderTraversal94();

    @Test
    public void testCase1() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        List<Integer> output = List.of(1, 3, 2);

        assertEquals(output, solution.inorderTraversal(root));
    }

    @Test
    public void testCase2() {
        TreeNode root = null;
        List<Integer> output = new ArrayList<>();

        assertEquals(output, solution.inorderTraversal(root));
    }

    @Test
    public void testCase3() {
        TreeNode root = new TreeNode(1);
        List<Integer> output = List.of(1);

        assertEquals(output, solution.inorderTraversal(root));
    }
}
