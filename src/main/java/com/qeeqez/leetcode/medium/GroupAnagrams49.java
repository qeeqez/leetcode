package com.qeeqez.leetcode.medium;

import java.util.*;
import java.util.stream.Collectors;

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
        List<List<String>> result = new ArrayList<>();

        Map<String, Integer> anagrams = new HashMap<>();

        for (String str : strs) {
            String sorted = str.chars()
                    .sorted()
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();

            if (anagrams.containsKey(sorted)) {
                result.get(anagrams.get(sorted)).add(str);
            } else {
                int pos = result.size();
                anagrams.put(sorted, pos);
                result.add(new ArrayList<>(List.of(str)));
            }
        }

        return result;
    }
}
