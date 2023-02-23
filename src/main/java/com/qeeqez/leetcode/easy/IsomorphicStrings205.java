package com.qeeqez.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 205. Isomorphic Strings
 * <p>
 * Given two strings s and t, determine if they are isomorphic.
 * <p>
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * <p>
 * All occurrences of a character must be replaced with another character
 * while preserving the order of characters.
 * No two characters may map to the same character, but a character may map to itself.
 */
public class IsomorphicStrings205 {

    // 100% CPU, 70% Mem
    public boolean isIsomorphic(String sString, String tString) {
        char[] s = sString.toCharArray();
        char[] t = tString.toCharArray();

        char[] sm = new char[256];
        char[] tm = new char[256];

        for (int i = 0; i < s.length; i++) {
            char si = s[i];
            char ti = t[i];
            if (sm[si] == 0 && tm[ti] == 0) {
                sm[si] = ti;
                tm[ti] = si;
            } else if (sm[si] != ti || tm[ti] != si) {
                return false;
            }
        }
        return true;
    }

    // 70% CPU, 77% Mem
    public boolean isIsomorphicHashMap(String s, String t) {
        Map<Character, Integer> charsS = new HashMap<>();
        Map<Character, Integer> charsT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Integer sI = charsS.get(s.charAt(i));
            Integer tI = charsT.get(t.charAt(i));
            if (sI == null && tI == null) {
                charsS.put(s.charAt(i), i);
                charsT.put(t.charAt(i), i);
            } else if (!Objects.equals(sI, tI)) {
                return false;
            }
        }
        return true;
    }

    // 65% CPU, 77% Mem
    public boolean isIsomorphicOneLine(String s, String t) {
        Map<Character, Integer> charsS = new HashMap<>();
        Map<Character, Integer> charsT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!Objects.equals(charsS.put(s.charAt(i), i), charsT.put(t.charAt(i), i))) {
                return false;
            }
        }
        return true;
    }

}

