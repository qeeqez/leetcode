package com.qeeqez.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TopKFrequentWords692Test {

    TopKFrequentWords692 solution = new TopKFrequentWords692();

    @Test
    public void testCase1() {
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        List<String> output = Arrays.asList("i", "love");

        assertEquals(output, solution.topKFrequent(words, k));
    }

    @Test
    public void testCase2() {
        String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        int k = 4;
        List<String> output = Arrays.asList("the", "is", "sunny", "day");

        assertEquals(output, solution.topKFrequent(words, k));
    }
}
