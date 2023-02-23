package com.qeeqez.leetcode.easy;

/**
 * 744. Find Smallest Letter Greater Than Target
 * <p>
 * You are given an array of characters letters that is sorted in non-decreasing order, and a character target.
 * There are at least two different characters in letters.
 * <p>
 * Return the smallest character in letters that is lexicographically greater than target.
 * If such a character does not exist, return the first character in letters.
 */
public class FindSmallestLetterFreaterThanTarget744 {

    public char nextGreatestLetter(char[] letters, char target) {
        int first = 0;
        int last = letters.length - 1;

        char output = letters[0];
        while (first <= last) {
            int middle = (last - first) / 2 + first;

            if (target < letters[middle]) {
                last = middle - 1;
                output = letters[middle];
            } else {
                first = middle + 1;
            }
        }

        return output;
    }
}

