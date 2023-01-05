package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeNumber9Test {

    PalindromeNumber9 palindromeNumber = new PalindromeNumber9();

    @Test
    public void testCase1() {
        int x = 121;
        boolean target = true;

        assertEquals(target, palindromeNumber.isPalindrome(x));
    }

    @Test
    public void testCase2() {
        int x = -121;
        boolean target = false;

        assertEquals(target, palindromeNumber.isPalindrome(x));
    }

    @Test
    public void testCase3() {
        int x = 10;
        boolean target = false;

        assertEquals(target, palindromeNumber.isPalindrome(x));
    }
}
