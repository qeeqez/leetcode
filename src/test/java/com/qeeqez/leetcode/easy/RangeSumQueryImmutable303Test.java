package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static com.qeeqez.leetcode.easy.RangeSumQueryImmutable303.NumArray;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RangeSumQueryImmutable303Test {

    @Test
    public void testSumRange() {
        NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});

        assertEquals(1, numArray.sumRange(0, 2));
        assertEquals(-1, numArray.sumRange(2, 5));
        assertEquals(-3, numArray.sumRange(0, 5));
    }

}
