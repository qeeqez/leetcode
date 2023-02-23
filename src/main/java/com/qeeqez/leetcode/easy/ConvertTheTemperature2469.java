package com.qeeqez.leetcode.easy;

/**
 * 2469. Convert the Temperature
 * <p>
 * You are given a non-negative floating point number rounded to two decimal places celsius, that denotes the temperature in Celsius.
 * <p>
 * You should convert Celsius into Kelvin and Fahrenheit and return it as an array ans = [kelvin, fahrenheit].
 * <p>
 * Return the array ans. Answers within 10-5 of the actual answer will be accepted.
 * <p>
 * Note that:
 * * Kelvin = Celsius + 273.15
 * * Fahrenheit = Celsius * 1.80 + 32.00
 */
public class ConvertTheTemperature2469 {

    public double[] convertTemperature(double celsius) {
        return new double[]{celsius + 273.15, celsius * 1.80 + 32.00};
    }
}

