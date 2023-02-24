package com.qeeqez.leetcode.easy;

/**
 * 1790. Check if One String Swap Can Make Strings Equal
 * <p>
 * You are given two strings s1 and s2 of equal length.
 * A string swap is an operation where you choose two indices in a string (not necessarily different)
 * and swap the characters at these indices.
 * <p>
 * Return true if it is possible to make both strings equal by performing at most
 * one string swap on exactly one of the strings.
 * Otherwise, return false.
 */
public class CheckIfOneStringSwapCanMakeStringsEqual1790 {

    // 100% CPU, 100% MEM
    public boolean areAlmostEqual(String s1, String s2) {
        char[] swapChars = new char[2];
        int countNotInPosition = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                countNotInPosition++;

                if (countNotInPosition > 2) return false;
                if (countNotInPosition == 2 && (swapChars[0] != s2.charAt(i) || swapChars[1] != s1.charAt(i)))
                    return false;
                if (countNotInPosition == 1 && i == s1.length() - 1) return false;

                swapChars[0] = s1.charAt(i);
                swapChars[1] = s2.charAt(i);
            }
        }
        return countNotInPosition == 0 || countNotInPosition == 2;
    }

}