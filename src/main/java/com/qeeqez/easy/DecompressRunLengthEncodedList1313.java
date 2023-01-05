package com.qeeqez.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1313. Decompress Run-Length Encoded List
 * <p>
 * We are given a list nums of integers representing a list compressed with run-length encoding.
 * <p>
 * Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).
 * For each such pair, there are freq elements with value val concatenated in a sublist.
 * Concatenate all the sublists from left to right to generate the decompressed list.
 * <p>
 * Return the decompressed list.
 */
public class DecompressRunLengthEncodedList1313 {

    // Fastest solution
    public int[] decompressRLElist(int[] nums) {
        int arraySize = 0;
        for (int i = 0; i < nums.length; i += 2) {
            arraySize += nums[i];
        }
        int[] output = new int[arraySize];

        int j = 0;
        for (int i = 0; i < nums.length; i += 2) {
            Arrays.fill(output, j, j + nums[i], nums[i + 1]);
            j += nums[i];
        }
        return output;
    }

    // Straightforward solution
    public int[] decompressRLElistSlowest(int[] nums) {
        List<Integer> outputList = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                outputList.add(nums[i + 1]);
            }
        }
        return outputList.stream().mapToInt(Integer::intValue).toArray();
    }

}

