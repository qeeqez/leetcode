package com.qeeqez.medium;

/**
 * 3. Longest Substring Without Repeating Characters
 * <p>
 * Given a string s, find the length of the longest substring without repeating characters.
 */
public class LongestSubstringWithoutRepeatingChars3 {

    // 93% CPU, 30% MEM
    public int lengthOfLongestSubstring(String s) {
        int count = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = sb.indexOf(String.valueOf(c));
            if (index != -1) {
                sb.delete(0, index + 1);
            }
            sb.append(c);
            count = Math.max(count, sb.length());
        }

        return count;
    }
}

