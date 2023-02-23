package com.qeeqez.leetcode.easy;

import java.util.stream.IntStream;

/**
 * 944. Delete Columns to Make Sorted
 * <p>
 * You are given an array of n strings strs, all of the same length.
 * <p>
 * The strings can be arranged such that there is one on each line, making a grid.
 * For example, strs = ["abc", "bce", "cae"] can be arranged as:
 * * abc
 * * bce
 * * cae
 * You want to delete the columns that are not sorted lexicographically.
 * In the above example (0-indexed),
 * columns 0 ('a', 'b', 'c') and 2 ('c', 'e', 'e') are sorted
 * while column 1 ('b', 'c', 'a') is not,
 * so you would delete column 1.
 * <p>
 * Return the number of columns that you will delete.
 */
public class DeleteColumnToMakeSorted944 {

    // Fast solution
    public int minDeletionSize(String[] strs) {
        int wordLength = strs[0].length();
        int count = 0;

        for (int column = 0; column < wordLength; column++) {
            char previous = '0';
            for (String word : strs) {
                char current = word.charAt(column);
                if (previous > current) {
                    count++;
                    break;
                }
                previous = current;
            }
        }
        return count;
    }

    // Slow solution
    public int minDeletionSizeSlow(String[] strs) {
        int wordLength = strs[0].length();

        int count = 0;
        boolean isFirst = true;
        char[] prevChars;
        char[] currentChars = new char[wordLength];
        int[] indexToCheck = IntStream.range(0, wordLength).toArray();
        for (String word : strs) {
            prevChars = currentChars;
            currentChars = word.toCharArray();
            if (isFirst) {
                isFirst = false;
                continue;
            }
            for (int i = 0; i < indexToCheck.length; i++) {
                if (indexToCheck[i] == -1) continue;
                if (prevChars[i] > currentChars[i]) {
                    count++;
                    indexToCheck[i] = -1;
                }
            }
        }
        return count;
    }
}

