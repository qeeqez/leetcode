package com.qeeqez.easy;

import java.util.LinkedList;
import java.util.List;

/**
 * 1389. Create Target Array in the Given Order
 * <p>
 * Given two arrays of integers nums and index. Your task is to create target array under the following rules:
 * <p>
 * * Initially target array is empty.
 * * From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
 * * Repeat the previous step until there are no elements to read in nums and index.
 * <p>
 * Return the target array.
 * It is guaranteed that the insertion operations will be valid.
 */
public class CreateTargetArrayGivenOrder1389 {

    // Fast solution
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> outputList = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            outputList.add(index[i], nums[i]);
        }
        int size = outputList.size();
        int[] output = new int[size];
        for (int i = 0; i < size; i++) {
            output[i] = outputList.get(i);
        }
        return output;
    }

    // Straightforward solution
    public int[] createTargetArraySlowest(int[] nums, int[] index) {
        List<Integer> outputList = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            outputList.add(index[i], nums[i]);
        }
        return outputList.stream().mapToInt(Integer::intValue).toArray();
    }

}

