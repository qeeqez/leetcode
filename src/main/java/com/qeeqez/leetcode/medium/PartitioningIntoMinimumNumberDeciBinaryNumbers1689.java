package com.qeeqez.leetcode.medium;

/**
 * 1689. Partitioning Into Minimum Number Of Deci-Binary Numbers
 * <p>
 * A decimal number is called deci-binary if each of its digits is either 0 or 1 without any leading zeros.
 * For example, 101 and 1100 are deci-binary, while 112 and 3001 are not.
 * <p>
 * Given a string n that represents a positive decimal integer,
 * return the minimum number of positive deci-binary numbers needed so that they sum up to n.
 */
public class PartitioningIntoMinimumNumberDeciBinaryNumbers1689 {

    // 73% CPU, 24% MEM
    public int minPartitionsOptimized(String n) {
        char tmp = 0;
        for (char c : n.toCharArray()) {
            tmp = c > tmp ? c : tmp;
        }
        return tmp - '0';
    }

    // 42% CPU, 31% MEM
    public int minPartitions(String n) {
        char tmp = 0;
        for (char c : n.toCharArray()) {
            tmp = c > tmp ? c : tmp;
        }
        return Character.getNumericValue(tmp);
    }

}

