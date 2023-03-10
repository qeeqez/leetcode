package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindDistanceValueBetweenTwoArrays1385Test {

    FindDistanceValueBetweenTwoArrays1385 solution = new FindDistanceValueBetweenTwoArrays1385();

    @Test
    public void testCase1() {
        int[] arr1 = {4, 5, 8};
        int[] arr2 = {10, 9, 1, 8};
        int d = 2;
        int output = 2;

        assertEquals(output, solution.findTheDistanceValue(arr1, arr2, d));
        assertEquals(output, solution.findTheDistanceValueBruteForce(arr1, arr2, d));
    }

    @Test
    public void testCase2() {
        int[] arr1 = {1, 4, 2, 3};
        int[] arr2 = {-4, -3, 6, 10, 20, 30};
        int d = 3;
        int output = 2;

        assertEquals(output, solution.findTheDistanceValue(arr1, arr2, d));
        assertEquals(output, solution.findTheDistanceValueBruteForce(arr1, arr2, d));
    }

    @Test
    public void testCase3() {
        int[] arr1 = {2, 1, 100, 3};
        int[] arr2 = {-5, -2, 10, -3, 7};
        int d = 6;
        int output = 1;

        assertEquals(output, solution.findTheDistanceValue(arr1, arr2, d));
        assertEquals(output, solution.findTheDistanceValueBruteForce(arr1, arr2, d));
    }

    @Test
    public void testCase4() {
        int[] arr1 = {-803, 715, -224, 909, 121, -296, 872, 807, 715, 407, 94, -8, 572, 90, -520, -867, 485, -918, -827, -728, -653, -659, 865, 102, -564, -452, 554, -320, 229, 36, 722, -478, -247, -307, -304, -767, -404, -519, 776, 933, 236, 596, 954, 464};
        int[] arr2 = {817, 1, -723, 187, 128, 577, -787, -344, -920, -168, -851, -222, 773, 614, -699, 696, -744, -302, -766, 259, 203, 601, 896, -226, -844, 168, 126, -542, 159, -833, 950, -454, -253, 824, -395, 155, 94, 894, -766, -63, 836, -433, -780, 611, -907, 695, -395, -975, 256, 373, -971, -813, -154, -765, 691, 812, 617, -919, -616, -510, 608, 201, -138, -669, -764, -77, -658, 394, -506, -675, 523, 730, -790, -109, 865, 975, -226, 651, 987, 111, 862, 675, -398, 126, -482, 457, -24, -356, -795, -575, 335, -350, -919, -945, -979, 611};
        int d = 37;
        int output = 0;

        assertEquals(output, solution.findTheDistanceValue(arr1, arr2, d));
        assertEquals(output, solution.findTheDistanceValueBruteForce(arr1, arr2, d));
    }
}
