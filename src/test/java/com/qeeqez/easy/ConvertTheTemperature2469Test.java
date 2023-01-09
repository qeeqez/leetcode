package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ConvertTheTemperature2469Test {

    ConvertTheTemperature2469 solution = new ConvertTheTemperature2469();

    @Test
    public void testCase1() {
        double celsius = 36.50;
        double[] output = {309.65000, 97.70000};

        assertArrayEquals(output, solution.convertTemperature(celsius));
    }

    @Test
    public void testCase2() {
        double celsius = 122.11;
        double[] output = {395.26000, 251.79800};

        assertArrayEquals(output, solution.convertTemperature(celsius));
    }

}
