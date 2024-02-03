package com.qeeqez.leetcode.medium;

import java.util.*;

/**
 * 49. Group Anagrams
 * <p>
 * Given an array of strings strs, group the anagrams together.
 * You can return the answer in any order.
 * <p>
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 */
public class GroupAnagrams49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for (String str : strs) {
            char[] wordArray = str.toCharArray();
            Arrays.sort(wordArray);
            String sorted = new String(wordArray);

            if (anagrams.containsKey(sorted)) {
                anagrams.get(sorted).add(str);
            } else {
                anagrams.put(sorted, new ArrayList<>(List.of(str)));
            }
        }

        return new ArrayList<>(anagrams.values());
    }
}
