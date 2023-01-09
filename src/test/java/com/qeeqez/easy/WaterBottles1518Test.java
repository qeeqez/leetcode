package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WaterBottles1518Test {

    WaterBottles1518 solution = new WaterBottles1518();

    @Test
    public void testCase1() {
        int numBottles = 9;
        int numExchange = 3;
        int output = 13;

        assertEquals(output, solution.numWaterBottles(numBottles, numExchange));
    }

    @Test
    public void testCase2() {
        int numBottles = 10;
        int numExchange = 3;
        int output = 14;

        assertEquals(output, solution.numWaterBottles(numBottles, numExchange));
    }

    @Test
    public void testCase3() {
        int numBottles = 15;
        int numExchange = 4;
        int output = 19;

        assertEquals(output, solution.numWaterBottles(numBottles, numExchange));
    }
}
