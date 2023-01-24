package com.qeeqez.easy;

import java.util.Stack;

/**
 * 844. Backspace String Compare
 * <p>
 * Given two strings s and t,
 * return true if they are equal when both are typed into empty text editors.
 * '#' means a backspace character.
 * <p>
 * Note that after backspacing an empty text, the text will continue empty.
 */
public class BackspaceStringCompare844 {

    // String Solution, 90% CPU, 30% MEM
    public boolean backspaceCompare(String s, String t) {
        return stringSolution(s).equals(stringSolution(t));
    }

    private String stringSolution(String sString) {
        StringBuilder sb = new StringBuilder();
        for (char c : sString.toCharArray()) {
            if (c == '#') {
                if (sb.length() != 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    // Stack Solution, 70% CPU, 6% MEM
    public boolean backspaceCompareStack(String sString, String tString) {
        Stack<Character> s = stringToStack(sString);
        Stack<Character> t = stringToStack(tString);

        return s.equals(t);
    }

    private Stack<Character> stringToStack(String sString) {
        Stack<Character> s = new Stack<>();
        for (char c : sString.toCharArray()) {
            if (c == '#') {
                if (!s.empty()) {
                    s.pop();
                }
            } else {
                s.push(c);
            }
        }
        return s;
    }

}

