package com.qeeqez.easy;

/**
 * 441. Arranging Coins
 * <p>
 * You have n coins and you want to build a staircase with these coins.
 * The staircase consists of k rows where the ith row has exactly i coins.
 * The last row of the staircase may be incomplete.
 * <p>
 * Given the integer n, return the number of complete rows of the staircase you will build.
 */
public class ArrangingCoins441 {

    // Binary Search Fast Solution
    public int arrangeCoins(int n) {
        if (n == 1) return 1;

        int first = 1;
        int last = n;

        int target = 0;
        while (first <= last) {
            int middle = (last - first) / 2 + first;

            long value = (long) (1 + middle) * middle / 2;
            if (n < value) {
                last = middle - 1;
                target = middle - 1;
            } else {
                first = middle + 1;
            }
        }

        return target;
    }

    // Slow Solution
    public int arrangeCoinsBruteForce(int n) {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            n -= i;
            if (n < 0) return i - 1;
        }
        return 0;
    }
}

