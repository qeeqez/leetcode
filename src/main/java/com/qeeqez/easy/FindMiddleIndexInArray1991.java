package com.qeeqez.easy;

/**
 * 1991. Find the Middle Index in Array
 * <p>
 * Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest amongst all the possible ones).
 * <p>
 * A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1].
 * <p>
 * If middleIndex == 0, the left side sum is considered to be 0.
 * Similarly, if middleIndex == nums.length - 1, the right side sum is considered to be 0.
 * <p>
 * Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.
 */
public class FindMiddleIndexInArray1991 {

    public int findMiddleIndex(int[] nums) {
        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 1; i < nums.length; i++) {
            sumRight += nums[i];
        }
        if (sumLeft == sumRight) return 0;
        for (int i = 1; i < nums.length; i++) {
            sumLeft += nums[i - 1];
            sumRight -= nums[i];
            if (sumLeft == sumRight) return i;
        }
        return -1;
    }
}

