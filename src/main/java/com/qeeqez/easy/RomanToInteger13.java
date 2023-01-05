package com.qeeqez.easy;

/**
 * 13. Roman to Integer
 * <p>
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * Symbol       Value
 * I            1
 * V            5
 * X            10
 * L            50
 * C            100
 * D            500
 * M            1000
 * <p>
 * For example, 2 is written as II in Roman numeral, just two ones added together.
 * 12 is written as XII, which is simply X + II.
 * The number 27 is written as XXVII, which is XX + V + II.
 * <p>
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII.
 * Instead, the number four is written as IV.
 * Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX.
 * There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * <p>
 * Given a roman numeral, convert it to an integer.
 */
public class RomanToInteger13 {
    public int romanToInt(String s) {
        int output = 0;
        char n;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i + 1 < s.length()) {
                n = s.charAt(i + 1);
            } else {
                n = 'q';
            }

            if (c == 'I') {
                if (n == 'V') {
                    output += 4;
                    i++;
                } else if (n == 'X') {
                    output += 9;
                    i++;
                } else {
                    output += 1;
                }
            } else if (c == 'V') {
                output += 5;
            } else if (c == 'X') {
                if (n == 'L') {
                    output += 40;
                    i++;
                } else if (n == 'C') {
                    output += 90;
                    i++;
                } else {
                    output += 10;
                }
            } else if (c == 'L') {
                output += 50;
            } else if (c == 'C') {
                if (n == 'D') {
                    output += 400;
                    i++;
                } else if (n == 'M') {
                    output += 900;
                    i++;
                } else {
                    output += 100;
                }
            } else if (c == 'D') {
                output += 500;
            } else if (c == 'M') {
                output += 1000;
            }
        }
        return output;
    }
}

