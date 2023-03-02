package com.qeeqez.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 1337. The K Weakest Rows in a Matrix
 * <p>
 * You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians).
 * The soldiers are positioned in front of the civilians.
 * That is, all the 1's will appear to the left of all the 0's in each row.
 * <p>
 * A row i is weaker than a row j if one of the following is true:
 * <p>
 * The number of soldiers in row i is less than the number of soldiers in row j.
 * Both rows have the same number of soldiers and i < j.
 * Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.
 */
public class TheKWeakestRowsInMatrix1337 {

    public int[] kWeakestRows(int[][] mat, int k) {
        List<Soldiers> weakRows = new ArrayList<>();

        for (int i = 0; i < mat.length; i++) {
            int currentSoldiers = getSoldierCount(mat[i]);
            weakRows.add(new Soldiers(i, currentSoldiers));
        }

        return weakRows.stream()
                .sorted((o1, o2) -> o1.count == o2.count ?
                        Integer.compare(o1.index, o2.index) :
                        Integer.compare(o1.count, o2.count)
                )
                .limit(k)
                .mapToInt(item -> item.index)
                .toArray();
    }

    private int getSoldierCount(int[] row) {
        int min = 0;
        int max = row.length - 1;

        int left = min;
        int right = max;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (row[middle] == 1) {
                if (middle == max || row[middle + 1] == 0) return middle + 1;
                left = middle + 1;
            } else {
                if (middle == min || row[middle - 1] == 1) return middle;
                right = middle - 1;
            }
        }

        return 0;
    }

    private static class Soldiers {
        int index;
        int count;

        Soldiers(int a, int b) {
            index = a;
            count = b;
        }

    }

}

