package com.qeeqez.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

/**
 * 496. Next Greater Element I
 * <p>
 * The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.
 * <p>
 * You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
 * <p>
 * For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.
 * <p>
 * Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.
 */
public class NextGreaterElementI496 {

    // 90% CPU - 3ms
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();
            }

            int nextGreater = st.isEmpty() ? -1 : st.peek();

            map.put(nums2[i], nextGreater);
            st.push(nums2[i]);
        }

        int[] output = new int[nums1.length];
        for (int i = 0; i < output.length; i++) {
            output[i] = map.get(nums1[i]);
        }

        return output;
    }

    // 10% CPU - 10ms
    public int[] nextGreaterElementBruteForce(int[] nums1, int[] nums2) {
        int[] output = new int[nums1.length];
        boolean[] visited = new boolean[nums1.length];

        Arrays.fill(output, -1);

        for (int num2 : nums2) {
            for (int j = 0; j < nums1.length; j++) {
                if (visited[j] && output[j] != -1) continue;

                if (visited[j] && num2 > nums1[j]) output[j] = num2;
                else if (num2 == nums1[j]) visited[j] = true;
            }
        }

        return output;
    }

}

