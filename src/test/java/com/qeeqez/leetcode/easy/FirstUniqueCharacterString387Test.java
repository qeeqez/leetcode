package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstUniqueCharacterString387Test {

    FirstUniqueCharacterString387 solution = new FirstUniqueCharacterString387();

    @Test
    public void testCase1() {
        String s = "leetcode";
        int output = 0;

        assertEquals(output, solution.firstUniqChar(s));
    }

    @Test
    public void testCase2() {
        String s = "loveleetcode";
        int output = 2;

        assertEquals(output, solution.firstUniqChar(s));
    }

    @Test
    public void testCase3() {
        String s = "aabb";
        int output = -1;

        assertEquals(output, solution.firstUniqChar(s));
    }

    @Test
    public void testCase4() {
        String s = "louveleetcodeloveleetcodeloveleetcodeloveleetcodeloveleetcodeloveleetcode";
        int output = 2;

        assertEquals(output, solution.firstUniqChar(s));
    }
}
