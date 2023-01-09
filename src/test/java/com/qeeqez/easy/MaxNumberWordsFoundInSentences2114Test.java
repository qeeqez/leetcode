package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxNumberWordsFoundInSentences2114Test {

    MaxNumberWordsFoundInSentences2114 solution = new MaxNumberWordsFoundInSentences2114();

    @Test
    public void testCase1() {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int output = 6;

        assertEquals(output, solution.mostWordsFound(sentences));
    }

    @Test
    public void testCase2() {
        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        int output = 3;

        assertEquals(output, solution.mostWordsFound(sentences));
    }

    @Test
    public void testCase3() {
        String[] sentences = {"w jrpihe zsyqn l dxchifbxlasaehj", "nmmfrwyl jscqyxk a xfibiooix xolyqfdspkliyejsnksfewbjom", "xnleojowaxwpyogyrayfgyuzhgtdzrsyococuqexggigtberizdzlyrdsfvryiynhg", "krpwiazoulcixkkeyogizvicdkbrsiiuhizhkxdpssynfzuigvcbovm", "rgmz rgztiup wqnvbucfqcyjivvoeedyxvjsmtqwpqpxmzdupfyfeewxegrlbjtsjkusyektigr", "o lgsbechr lqcgfiat pkqdutzrq iveyv iqzgvyddyoqqmqerbmkxlbtmdtkinlk", "hrvh efqvjilibdqxjlpmanmogiossjyxepotezo", "qstd zui nbbohtuk", "qsdrerdzjvhxjqchvuewevyzlkyydpeeblpc"};
        int output = 6;

        assertEquals(output, solution.mostWordsFound(sentences));
    }
}
