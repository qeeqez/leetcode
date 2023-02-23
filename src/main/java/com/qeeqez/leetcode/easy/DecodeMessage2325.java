package com.qeeqez.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 2325. Decode the Message
 * <p>
 * You are given the strings key and message, which represent a cipher key and a secret message, respectively.
 * The steps to decode message are as follows:
 * <p>
 * Use the first appearance of all 26 lowercase English letters in key as the order of the substitution table.
 * Align the substitution table with the regular English alphabet.
 * Each letter in message is then substituted using the table.
 * Spaces ' ' are transformed to themselves.
 * For example, given key = "happy boy" (actual key would have at least one instance of each letter in the alphabet), we have the partial substitution table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').
 * Return the decoded message.
 */
public class DecodeMessage2325 {

    // HashMap - 91% CPU, 100% MEM
    public String decodeMessage(String key, String message) {
        Map<Character, Character> mappingTable = new HashMap<>();

        int counter = 0;
        for (int i = 0; i < 26 && i < key.length(); i++) {
            char c = key.charAt(i);
            if (c != ' ' && !mappingTable.containsKey(c)) {
                char alphabet = (char) ('a' + counter);
                mappingTable.put(c, alphabet);
                counter++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char letter : message.toCharArray()) {
            if (letter == ' ') {
                sb.append(letter);
            } else if (mappingTable.containsKey(letter)) {
                char realLetter = mappingTable.get(letter);
                sb.append(realLetter);
            }
        }

        return sb.toString();
    }

}

