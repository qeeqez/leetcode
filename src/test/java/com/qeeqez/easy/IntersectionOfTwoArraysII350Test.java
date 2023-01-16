package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntersectionOfTwoArraysII350Test {

    IntersectionOfTwoArraysII350 solution = new IntersectionOfTwoArraysII350();

    @Test
    public void testCase1() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] output = {2, 2};

        checkArraysEqualsAnyOrder(output, solution.intersectBruteForce(nums1, nums2));
        checkArraysEqualsAnyOrder(output, solution.intersect(nums1, nums2));
        checkArraysEqualsAnyOrder(output, solution.intersectFast(nums1, nums2));
    }

    @Test
    public void testCase2() {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] output = {4, 9};

        checkArraysEqualsAnyOrder(output, solution.intersectBruteForce(nums1, nums2));
        checkArraysEqualsAnyOrder(output, solution.intersect(nums1, nums2));
        checkArraysEqualsAnyOrder(output, solution.intersectFast(nums1, nums2));
    }

    @Test
    public void testCase3() {
        int[] nums1 = {9, 4, 9, 8, 4};
        int[] nums2 = {4, 9, 5};
        int[] output = {4, 9};

        checkArraysEqualsAnyOrder(output, solution.intersectBruteForce(nums1, nums2));
        checkArraysEqualsAnyOrder(output, solution.intersect(nums1, nums2));
        checkArraysEqualsAnyOrder(output, solution.intersectFast(nums1, nums2));
    }

    @Test
    public void testCase4() {
        int[] nums1 = {1, 2};
        int[] nums2 = {1, 1};
        int[] output = {1};

        checkArraysEqualsAnyOrder(output, solution.intersectBruteForce(nums1, nums2));
        checkArraysEqualsAnyOrder(output, solution.intersect(nums1, nums2));
        checkArraysEqualsAnyOrder(output, solution.intersectFast(nums1, nums2));
    }

    void checkArraysEqualsAnyOrder(int[] array1, int[] array2) {
        List<Integer> list1 = Arrays.stream(array1).boxed().toList();
        List<Integer> list2 = Arrays.stream(array2).boxed().toList();

        assertEquals(list1.size(), list2.size());
        assertTrue(list1.containsAll(list2));
    }

}
