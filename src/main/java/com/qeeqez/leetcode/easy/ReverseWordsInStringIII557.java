package com.qeeqez.leetcode.easy;

/**
 * 557. Reverse Words in a String III
 * <p>
 * Given a string s, reverse the order of characters in each word
 * within a sentence while still preserving whitespace and initial word order.
 */
public class ReverseWordsInStringIII557 {

    // 3 ms Solution
    public String reverseWordsFast(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            sb.append(new StringBuilder(words[i]).reverse());
            if (i != words.length - 1) sb.append(" ");
        }
        return sb.toString();
    }

    // 4 ms Solution
    public String reverseWords(String s) {
        char[] array = s.toCharArray();
        char spaceChar = ' ';
        int firstIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1 || array[i + 1] == spaceChar) {
                for (int j = i; j >= firstIndex; j--) {
                    char temp = array[firstIndex];
                    array[firstIndex] = array[j];
                    array[j] = temp;
                    firstIndex++;
                }
                if (i != array.length - 1) {
                    i++;
                    array[i] = spaceChar;
                    firstIndex = i + 1;
                }
            }
        }
        return new String(array);
    }

    // 8 ms Solution
    public String reverseWordsSlow(String s) {
        StringBuilder sb = new StringBuilder();
        char spaceChar = ' ';
        int firstIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1 || s.charAt(i + 1) == spaceChar) {
                for (int j = i; j >= firstIndex; j--) {
                    sb.append(s.charAt(j));
                }
                if (i != s.length() - 1) {
                    sb.append(spaceChar);
                    i++;
                    firstIndex = i + 1;
                }
            }
        }
        return sb.toString();
    }
}

