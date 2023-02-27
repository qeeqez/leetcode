package com.qeeqez.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 953. Verifying an Alien Dictionary
 * <p>
 * In an alien language, surprisingly, they also use English lowercase letters,
 * but possibly in a different order.
 * The order of the alphabet is some permutation of lowercase letters.
 * <p>
 * Given a sequence of words written in the alien language, and the order of the alphabet,
 * return true if and only if the given words are sorted lexicographically in this alien language.
 */
public class VerifyingAlienDictionary953 {

    public boolean isAlienSorted(String[] words, String order) {
        if (words.length == 1) return true;

        Map<Character, Integer> alphabet = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            alphabet.put(order.charAt(i), i);
        }

        for (int i = 0; i < words.length - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];

            for (int j = 0; j < word1.length(); j++) {
                if (j == word2.length()) return false;
                char c2 = word2.charAt(j);
                char c1 = word1.charAt(j);

                if (alphabet.get(c2) < alphabet.get(c1)) return false;
                else if (alphabet.get(c2) > alphabet.get(c1)) break;
            }
        }

        return true;
    }

}

