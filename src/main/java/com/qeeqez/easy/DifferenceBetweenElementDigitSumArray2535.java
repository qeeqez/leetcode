package com.qeeqez.easy;

/**
 * 2535. Difference Between Element Sum and Digit Sum of an Array
 * <p>
 * You are given a positive integer num consisting of exactly four digits.
 * Split num into two new integers new1 and new2 by using the digits found in num.
 * Leading zeros are allowed in new1 and new2, and all the digits found in num must be used.
 * <p>
 * For example, given num = 2932, you have the following digits: two 2's, one 9 and one 3.
 * Some of the possible pairs [new1, new2] are [22, 93], [23, 92], [223, 9] and [2, 329].
 * Return the minimum possible sum of new1 and new2.
 */
public class DifferenceBetweenElementDigitSumArray2535 {

    // 100% CPU, 90% MEM
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for (int num : nums) {
            elementSum += num;
            digitSum += digitSum(num);
        }
        return elementSum - digitSum;
    }

    public int digitSum(int num) {
        int digitSum = 0;
        while (num > 0) {
            digitSum += num % 10;
            num /= 10;
        }
        return digitSum;
    }

}

