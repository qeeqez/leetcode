package com.qeeqez.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 20. Valid Parentheses
 * <p>
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * * Open brackets must be closed by the same type of brackets.
 * * Open brackets must be closed in the correct order.
 * * Every close bracket has a corresponding open bracket of the same type.
 */
public class ValidParentheses20 {

    public boolean isValid(String s) {
        if (s.length() == 1) return false;
        List<Character> closeBrackets = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            switch (current) {
                case '(' -> closeBrackets.add(')');
                case '{' -> closeBrackets.add('}');
                case '[' -> closeBrackets.add(']');
                default -> {
                    int size = closeBrackets.size();
                    if (size > 0 && current == closeBrackets.get(size - 1)) {
                        closeBrackets.remove(size - 1);
                    } else {
                        return false;
                    }
                }
            }
        }
        return closeBrackets.size() == 0;
    }

}

