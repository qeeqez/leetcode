package com.qeeqez.easy;

import java.util.List;

/**
 * 1773. Count Items Matching a Rule
 * <p>
 * You are given an array items, where each items[i] = [typei, colori, namei]
 * describes the type, color, and name of the ith item.
 * You are also given a rule represented by two strings, ruleKey and ruleValue.
 * <p>
 * The ith item is said to match the rule if one of the following is true:
 * * ruleKey == "type" and ruleValue == typei.
 * * ruleKey == "color" and ruleValue == colori.
 * * ruleKey == "name" and ruleValue == namei.
 * <p>
 * Return the number of items that match the given rule.
 */
public class CountMatches1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int i = 0;
        switch (ruleKey) {
            case "color" -> i = 1;
            case "name" -> i = 2;
        }

        int count = 0;
        for (List<String> item : items) {
            if (item.get(i).equals(ruleValue)) count++;
        }
        return count;
    }
}

