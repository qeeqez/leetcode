package com.qeeqez.leetcode.easy;

/**
 * 520. Detect Capital
 * <p>
 * We define the usage of capitals in a word to be right when one of the following cases holds:
 * <p>
 * All letters in this word are capitals, like "USA".
 * All letters in this word are not capitals, like "leetcode".
 * Only the first letter in this word is capital, like "Google".
 * Given a string word, return true if the usage of capitals in it is right.
 */
public class DetectCapital520 {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 1) return true;


        char[] wordChars = word.toCharArray();
        boolean firstIsCapital = Character.isUpperCase(wordChars[0]);
        boolean secondIsCapital = Character.isUpperCase(wordChars[1]);

        if (!firstIsCapital && secondIsCapital) return false;

        boolean isAllCapital = firstIsCapital && secondIsCapital;

        for (int i = 2; i < wordChars.length; i++) {
            boolean isCapital = Character.isUpperCase(wordChars[i]);
            if (isAllCapital && !isCapital) {
                return false;
            } else if (!isAllCapital && isCapital) {
                return false;
            }
        }
        return true;
    }
}

