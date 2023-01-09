package com.qeeqez.easy;

/**
 * 2114. Maximum Number of Words Found in Sentences
 * <p>
 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
 * <p>
 * You are given an array of strings sentences, where each sentences[i] represents a single sentence.
 * <p>
 * Return the maximum number of words that appear in a single sentence.
 */
public class MaxNumberWordsFoundInSentences2114 {

    public int mostWordsFound(String[] sentences) {
        int maxCount = 0;
        for (String sentence : sentences) {
            int occurences = sentence.split(" ").length;
            if (occurences > maxCount) maxCount = occurences;
        }
        return maxCount;
    }
}

