package com.qeeqez.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 784. Letter Case Permutation
 * <p>
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
 * <p>
 * In other words, return true if one of s1's permutations is the substring of s2.
 */
public class LetterCasePermutation784 {

    public List<String> letterCasePermutation(String s) {
        List<String> permutations = new ArrayList<>();
        getPermutations(permutations, s.toCharArray(), 0);
        return permutations;
    }

    private void getPermutations(List<String> permutations, char[] chars, int start) {
        if (start == chars.length) {
            permutations.add(new String(chars));
            return;
        }
        if (Character.isDigit(chars[start])) {
            getPermutations(permutations, chars, start + 1);
            return;
        }

        chars[start] = Character.toLowerCase(chars[start]);
        getPermutations(permutations, chars, start + 1);

        chars[start] = Character.toUpperCase(chars[start]);
        getPermutations(permutations, chars, start + 1);
    }

}

