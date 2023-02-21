package com.qeeqez.easy;

import java.util.Arrays;

/**
 * 976. Largest Perimeter Triangle
 * <p>
 * Given an integer array nums, return the largest perimeter of a triangle with a non-zero area,
 * formed from three of these lengths.
 * If it is impossible to form any triangle of a non-zero area, return 0.
 */
public class LargestPerimeterTriangle976 {

    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i] < nums[i - 1] + nums[i - 2]) {
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }

        return 0;
    }

    // Time Limit Exceeded
    public int largestPerimeterBruteforce(int[] nums) {
        int maxPerimeter = 0;

        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 2; i--) {
            for (int j = i - 1; j >= 1; j--) {
                for (int k = j - 1; k >= 0; k--) {
                    if (isTrianglePossible(nums[i], nums[j], nums[k])) {
                        int perimeter = nums[i] + nums[j] + nums[k];
                        maxPerimeter = Math.max(maxPerimeter, perimeter);
                    }
                }
            }
        }

        return maxPerimeter;
    }

    private boolean isTrianglePossible(int side1, int side2, int side3) {
        return side1 + side2 > side3
                && side1 + side3 > side2
                && side2 + side3 > side1;
    }

}

