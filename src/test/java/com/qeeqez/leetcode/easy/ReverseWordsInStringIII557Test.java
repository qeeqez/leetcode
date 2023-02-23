package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsInStringIII557Test {

    ReverseWordsInStringIII557 solution = new ReverseWordsInStringIII557();

    @Test
    public void testCase1() {
        String s = "Let's take LeetCode contest";
        String output = "s'teL ekat edoCteeL tsetnoc";

        assertEquals(output, solution.reverseWordsSlow(s));
        assertEquals(output, solution.reverseWords(s));
        assertEquals(output, solution.reverseWordsFast(s));
    }

    @Test
    public void testCase2() {
        String s = "God Ding";
        String output = "doG gniD";

        assertEquals(output, solution.reverseWordsSlow(s));
        assertEquals(output, solution.reverseWords(s));
        assertEquals(output, solution.reverseWordsFast(s));
    }

    @Test
    public void testCase3() {
        String s = "I love u";
        String output = "I evol u";

        assertEquals(output, solution.reverseWordsSlow(s));
        assertEquals(output, solution.reverseWords(s));
        assertEquals(output, solution.reverseWordsFast(s));
    }
}
