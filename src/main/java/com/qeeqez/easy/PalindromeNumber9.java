package com.qeeqez.easy;

/**
 * 9. Palindrome Number
 * <p>
 * Given an integer x,
 * return true if x is a palindrome
 * and false otherwise.
 */
public class PalindromeNumber9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        if (x < 100) {
            return x % 10 == x / 10;
        }

        String xS = String.valueOf(x);

        for (int i = 0, j = xS.length() - 1; i < xS.length() / 2 && j > xS.length() / 2 - 1; i++, j--) {
            boolean result = xS.charAt(i) == xS.charAt(j);
            if (!result) {
                return false;
            }
        }
        return true;
    }
}

