package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountMatches1773Test {

    CountMatches1773 solution = new CountMatches1773();

    @Test
    public void testCase1() {
        List<List<String>> items = new ArrayList<>(List.of(
                List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "lenovo"),
                List.of("phone", "gold", "iphone")
        ));
        String ruleKey = "color";
        String ruleValue = "silver";
        int output = 1;

        assertEquals(output, solution.countMatches(items, ruleKey, ruleValue));
    }

    @Test
    public void testCase2() {
        List<List<String>> items = new ArrayList<>(List.of(
                List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "phone"),
                List.of("phone", "blue", "pixel")
        ));
        String ruleKey = "type";
        String ruleValue = "phone";
        int output = 2;

        assertEquals(output, solution.countMatches(items, ruleKey, ruleValue));
    }
}
