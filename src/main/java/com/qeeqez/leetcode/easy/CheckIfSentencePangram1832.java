package com.qeeqez.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 1832. Check if the Sentence Is Pangram
 * <p>
 * A pangram is a sentence where every letter of the English alphabet appears at least once.
 * <p>
 * Given a string sentence containing only lowercase English letters,
 * return true if sentence is a pangram, or false otherwise.
 */
public class CheckIfSentencePangram1832 {

    // 100% CPU, 95% MEM
    public boolean checkIfPangram(String sentence) {
        char c = 'a';
        int alphabetLength = 26;

        for (int i = 0; i < alphabetLength; i++) {
            if (sentence.indexOf(c) == -1) return false;
            c++;
        }

        return true;
    }

    // 70% CPU, 70% MEM
    public boolean checkIfPangramHashSet(String sentence) {
        Set<Integer> letters = new HashSet<>();

        sentence.chars()
                .forEach(letters::add);

        return letters.size() == 26;
    }

}
