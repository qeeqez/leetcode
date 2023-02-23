package com.qeeqez.leetcode.easy;

/**
 * 1859. Sorting the Sentence
 * <p>
 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
 * Each word consists of lowercase and uppercase English letters.
 * <p>
 * A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.
 * <p>
 * * For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
 * <p>
 * Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.
 */
public class SortingSentence1859 {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        int wordCount = words.length;
        String[] sentence = new String[wordCount];

        StringBuilder output = new StringBuilder();
        for (String word : words) {
            int position = Character.getNumericValue(word.charAt(word.length() - 1)) - 1;
            String correctWord = word.substring(0, word.length() - 1);
            sentence[position] = correctWord;
        }
        for (int i = 0; i < wordCount; i++) {
            output.append(sentence[i]);
            if (i < wordCount - 1) output.append(" ");
        }
        return output.toString();
    }
}