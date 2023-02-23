package com.qeeqez.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 290. Word Pattern
 * <p>
 * Given a pattern and a string s, find if s follows the same pattern.
 * <p>
 * Here follow means a full match,
 * such that there is a bijection between
 * a letter in pattern and a non-empty word in s.
 */
public class WordPattern290 {

    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        Map<Character, String> match = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            Character key = pattern.charAt(i);
            String value = words[i];
            if (match.containsKey(key) && !match.get(key).equals(value)) {
                return false;
            } else if (match.containsValue(value) && !match.containsKey(key)) {
                return false;
            } else {
                match.put(key, value);
            }
        }
        return true;
    }
}

