package com.qeeqez.easy;

/**
 * 344. Reverse String
 * <p>
 * Write a function that reverses a string. The input string is given as an array of characters s.
 * <p>
 * You must do this by modifying the input array in-place with O(1) extra memory.
 */
public class ReverseString344 {
    public void reverseString(char[] s) {
        char tmp;
        int j;
        int length = s.length % 2 == 0 ? s.length / 2 : s.length / 2 + 1;
        for (int i = 0; i < length; i++) {
            tmp = s[i];
            j = s.length - i - 1;
            s[i] = s[j];
            s[j] = tmp;
        }
    }
}

