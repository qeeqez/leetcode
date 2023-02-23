package com.qeeqez.leetcode.easy;

/**
 * 67. Add Binary
 * <p>
 * Given two binary strings a and b, return their sum as a binary string.
 */
public class AddBinary67 {
    public String addBinary(String a, String b) {
        StringBuilder output = new StringBuilder();
        int maxLength = Math.max(a.length(), b.length());
        int minLength = Math.min(a.length(), b.length());
        int carry = 0;

        for (int i = maxLength - 1, j = minLength - 1; i >= 0; i--, j--) {
            int sum = carry;
            sum += a.length() > b.length() ? getChar(a, i) : getChar(b, i);
            if (j >= 0) {
                sum += a.length() > b.length() ? getChar(b, j) : getChar(a, j);
            }

            if (sum == 2) {
                sum = 0;
                carry = 1;
            } else if (sum == 3) {
                sum = 1;
                carry = 1;
            } else {
                carry = 0;
            }

            output.append(sum);
        }

        if (carry == 1) {
            output.append(carry);
        }
        return output.reverse().toString();
    }

    int getChar(String str, int index) {
        return str.charAt(index) - '0';
    }
}

