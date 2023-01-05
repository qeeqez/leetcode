package com.qeeqez.easy;

/**
 * 1221. Split a String in Balanced Strings
 * <p>
 * Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
 * <p>
 * Given a balanced string s, split it into some number of substrings such that:
 * * Each substring is balanced.
 * Return the maximum number of balanced strings you can obtain.
 */
public class SplitStringInBalancedStrings1221 {

    public int balancedStringSplit(String s) {
        int count = 0;
        int maxNumber = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                maxNumber++;
            }
        }
        return maxNumber;
    }

}

