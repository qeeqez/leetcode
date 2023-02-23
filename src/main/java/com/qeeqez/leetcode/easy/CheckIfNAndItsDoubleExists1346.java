package com.qeeqez.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 1346. Check If N and Its Double Exist
 * <p>
 * Given an array arr of integers, check if there exist two indices i and j such that :
 * * i != j
 * * 0 <= i, j < arr.length
 * * arr[i] == 2 * arr[j]
 */
public class CheckIfNAndItsDoubleExists1346 {

    // Naive fastest and low memory solution
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                for (int j = 0; j < arr.length; j++) {
                    if (j != i) {
                        if (arr[j] * 2 == arr[i]) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    // Alternative, same speed, much memory
    public boolean checkIfExistSet(int[] arr) {
        Set<Integer> visited = new HashSet<>();
        for (int i : arr) {
            if (visited.contains(2 * i) || i % 2 == 0 && visited.contains(i / 2))
                return true;
            visited.add(i);
        }
        return false;
    }

}

