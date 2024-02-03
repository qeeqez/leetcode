package com.qeeqez.leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class GroupAnagrams49Test {

    GroupAnagrams49 solution = new GroupAnagrams49();

    private List<List<String>> getResult(String[] strs) {
        List<List<String>> result = solution.groupAnagrams(strs);
        result.forEach(Collections::sort);

        return result;
    }

    @Test
    void testCase1() {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> output = List.of(List.of("bat"), List.of("nat", "tan"), List.of("ate", "eat", "tea"));

        assertThat(output).hasSameElementsAs(getResult(strs));
    }

    @Test
    void testCase2() {
        String[] strs = new String[]{""};
        List<List<String>> output = List.of(List.of(""));

        assertThat(output).hasSameElementsAs(getResult(strs));
    }

    @Test
    void testCase3() {
        String[] strs = new String[]{"a"};
        List<List<String>> output = List.of(List.of("a"));

        assertThat(output).hasSameElementsAs(getResult(strs));
    }

}