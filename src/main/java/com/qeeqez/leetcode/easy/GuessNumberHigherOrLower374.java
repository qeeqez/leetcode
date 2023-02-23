package com.qeeqez.leetcode.easy;

/**
 * 374. Guess Number Higher or Lower
 * <p>
 * We are playing the Guess Game. The game is as follows:
 * <p>
 * I pick a number from 1 to n. You have to guess which number I picked.
 * <p>
 * Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
 * <p>
 * You call a pre-defined API int guess(int num), which returns three possible results:
 * <p>
 * -1: Your guess is higher than the number I picked (i.e. num > pick).
 * 1: Your guess is lower than the number I picked (i.e. num < pick).
 * 0: your guess is equal to the number I picked (i.e. num == pick).
 * Return the number that I picked.
 */
public class GuessNumberHigherOrLower374 {

    public int guessNumber(int n, int realGuess) {
        if (n == 1) {
            return n;
        }

        int pivot;
        int left = 1;
        int right = n;
        int currentGuess;

        while (right >= left) {

            pivot = left + (right - left) / 2;
            currentGuess = guess(pivot, realGuess);

            if (currentGuess == 0) {
                return pivot;
            } else if (currentGuess == -1) {
                right = pivot - 1;
            } else {
                left = pivot + 1;
            }
        }

        return right;
    }

    /**
     * Forward declaration of guess API.
     *
     * @param num your guess
     * @return -1 if num is higher than the guess number
     * 1 if num is lower than the guess number
     * otherwise return 0
     * int guess(int num);
     */
    private int guess(int num, int realGuess) {
        if (num > realGuess) {
            return -1;
        } else if (num < realGuess) {
            return 1;
        }
        return 0;
    }
}

