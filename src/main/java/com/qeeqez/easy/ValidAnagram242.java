package com.qeeqez.easy;

/**
 * 242. Valid Anagram
 * <p>
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * <p>
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 */
public class ValidAnagram242 {

    // Same as 383. Ransom Note
    public boolean isAnagram(String s, String t) {
        return new RansomNote383().canConstruct(s, t);
    }

}

