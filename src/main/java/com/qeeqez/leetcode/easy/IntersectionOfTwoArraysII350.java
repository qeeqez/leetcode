package com.qeeqez.leetcode.easy;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 350. Intersection of Two Arrays II
 * <p>
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 */
public class IntersectionOfTwoArraysII350 {

    // Fastest Solution
    public int[] intersectFast(int[] nums1, int[] nums2) {
        int[] temp = new int[1001];
        int[] output = new int[1001];
        int count = 0;

        for (int item : nums1)
            temp[item]++;
        for (int item : nums2) {
            if (temp[item] > 0) {
                output[count] = item;
                count++;
                temp[item] -= 1;
            }
        }
        return Arrays.copyOfRange(output, 0, count);
    }

    // HashMap Solution
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> temp = new HashMap<>();
        List<Integer> output = new ArrayList<>();

        for (int item : nums1) {
            temp.put(item, temp.getOrDefault(item, 0) + 1);
        }
        for (int item : nums2) {
            int value = temp.getOrDefault(item, 0);
            if (value > 0) {
                temp.put(item, value - 1);
                output.add(item);
            }
        }

        // Usage of Java Stream API is much slower, so we use simple approach
        int[] answer = new int[output.size()];
        for (int i = 0; i < output.size(); i++) {
            answer[i] = output.get(i);
        }
        return answer;
    }


    // BruteForce Solution
    public int[] intersectBruteForce(int[] nums1, int[] nums2) {
        List<Integer> output = nums2.length > nums1.length ?
                findIntersectBruteForce(nums1, nums2) : findIntersectBruteForce(nums2, nums1);
        return output.stream().mapToInt(Integer::intValue).toArray();
    }

    List<Integer> findIntersectBruteForce(int[] nums1, int[] nums2) {
        List<Integer> output = new ArrayList<>();
        List<Integer> nums2List = Arrays.stream(nums2).boxed().collect(Collectors.toCollection(LinkedList::new));
        for (int item : nums1) {
            for (int i = 0; i < nums2List.size(); i++) {
                if (item == nums2List.get(i)) {
                    output.add(item);
                    nums2List.remove(i);
                    break;
                }
            }
        }
        return output;
    }

}

