package com.qeeqez.easy;

/**
 * 26. Remove Duplicates from Sorted Array
 * <p>
 * Given an integer array nums sorted in non-decreasing order,
 * remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same.
 * <p>
 * Since it is impossible to change the length of the array in some languages,
 * you must instead have the result be placed in the first part of the array nums.
 * More formally, if there are k elements after removing the duplicates,
 * then the first k elements of nums should hold the final result.
 * It does not matter what you leave beyond the first k elements.
 * <p>
 * Return k after placing the final result in the first k slots of nums.
 * <p>
 * Do not allocate extra space for another array.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 */
public class RemoveDuplicatesFromSortedArray26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int occurencies = 1;
        int uniquePosition = 0;
        for (int i = 0; i < nums.length - 1 && uniquePosition < nums.length - 1; i++) {
            while (uniquePosition < nums.length - 1) {
                uniquePosition++;
                if (nums[uniquePosition] != nums[i]) {
                    occurencies++;
                    break;
                }
            }
            nums[i + 1] = nums[uniquePosition];
        }
        return occurencies;
    }
}

