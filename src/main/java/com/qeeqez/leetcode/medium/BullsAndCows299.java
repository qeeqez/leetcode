package com.qeeqez.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * 299. Bulls and Cows
 * <p>
 * You are playing the Bulls and Cows game with your friend.
 * <p>
 * You write down a secret number and ask your friend to guess what the number is.
 * When your friend makes a guess, you provide a hint with the following info:
 * <p>
 * The number of "bulls", which are digits in the guess that are in the correct position.
 * The number of "cows", which are digits in the guess that are in your secret number
 * but are located in the wrong position. Specifically,
 * the non-bull digits in the guess that could be rearranged such that they become bulls.
 * Given the secret number secret and your friend's guess, return the hint for your friend's guess.
 * <p>
 * The hint should be formatted as "xAyB", where x is the number of bulls and y is the number of cows.
 * Note that both secret and guess may contain duplicate digits.
 */
public class BullsAndCows299 {

    // Slightly Optimized Solution, 93% CPU, 66% MEM
    public String getHintOptimized(String secret, String guess) {
        int countBulls = 0, countCows = 0;
        int[] digitCount = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            int s = secret.charAt(i);
            int g = guess.charAt(i);
            if (s == g) {
                countBulls++;
            } else {
                s -= '0';
                g -= '0';
                if (digitCount[s] < 0) countCows++;
                if (digitCount[g] > 0) countCows++;
                digitCount[s]++;
                digitCount[g]--;
            }
        }
        return countBulls + "A" + countCows + "B";
    }

    // Fast Solution, 70% CPU, 81% MEM
    public String getHint(String secret, String guess) {
        int countBulls = 0, countCows = 0;
        int[] digitCount = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            int s = Character.getNumericValue(secret.charAt(i));
            int g = Character.getNumericValue(guess.charAt(i));
            if (s == g) {
                countBulls++;
            } else {
                if (digitCount[s] < 0) countCows++;
                if (digitCount[g] > 0) countCows++;
                digitCount[s]++;
                digitCount[g]--;
            }
        }
        return countBulls + "A" + countCows + "B";
    }

    // HashMap Slow Solution, 20% CPU, 22% MEM
    public String getHintHashMap(String secret, String guess) {
        Map<Character, Integer> count = new HashMap<>();
        int countBulls = 0, countCows = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                countBulls++;
                continue;
            }
            Integer currentCount = count.getOrDefault(secret.charAt(i), 0) + 1;
            count.put(secret.charAt(i), currentCount);
        }
        for (int i = 0; i < guess.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                continue;
            }

            Integer currentCount = count.getOrDefault(guess.charAt(i), 0);

            if (currentCount > 0) {
                countCows++;
                currentCount--;
                count.put(guess.charAt(i), currentCount);
            }

        }
        return countBulls + "A" + countCows + "B";
    }

}

