package com.qeeqez.easy;

/**
 * 1365. How Many Numbers Are Smaller Than the Current Number
 * <p>
 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
 * That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
 * <p>
 * Return the answer in an array.
 */
public class HowManyNumbersAreSmallerThanCurrent1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    output[i]++;
                } else if (nums[i] < nums[j]) {
                    output[j]++;
                }
            }
        }
        return output;
    }
}

