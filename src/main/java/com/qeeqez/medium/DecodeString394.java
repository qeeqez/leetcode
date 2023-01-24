package com.qeeqez.medium;

/**
 * 394. Decode String
 * <p>
 * Given an encoded string, return its decoded string.
 * <p>
 * The encoding rule is: k[encoded_string],
 * where the encoded_string inside the square brackets is being repeated exactly k times.
 * Note that k is guaranteed to be a positive integer.
 * <p>
 * You may assume that the input string is always valid; there are no extra white spaces,
 * square brackets are well-formed, etc.
 * Furthermore, you may assume that the original data does not contain any digits
 * and that digits are only for those repeat numbers, k.
 * For example, there will not be input like 3a or 2[4].
 * <p>
 * The test cases are generated so that the length of the output will never exceed 105.
 */
public class DecodeString394 {

    public String decodeString(String s) {
        StringBuilder text = new StringBuilder();
        StringBuilder number = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                number.append(s.charAt(i));
            } else if (s.charAt(i) == '[') {
                int countChars = Integer.parseInt(number.toString());
                number.setLength(0);
                int countBracket = 1;
                i++;
                int j = i;
                for (; j < s.length(); j++) {
                    if (s.charAt(j) == '[') {
                        countBracket++;
                    } else if (s.charAt(j) == ']') {
                        countBracket--;
                        if (countBracket == 0) break;
                    }
                }
                String subString = s.substring(i, j);
                String decoded = decodeString(subString);
                i = j;
                text.append(decoded.repeat(countChars));
            } else {
                text.append(s.charAt(i));
            }
        }
        return text.toString();
    }

}

