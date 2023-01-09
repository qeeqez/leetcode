package com.qeeqez.easy;

/**
 * 367. Valid Perfect Square
 * <p>
 * Given a positive integer num, return true if num is a perfect square or false otherwise.
 * <p>
 * A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.
 * <p>
 * You must not use any built-in library function, such as sqrt.
 */
public class ValidPerfectSquare367 {

    // n^2 = 1 + 3 + 5 + ... + (2n-1)
    public boolean isPerfectSquare(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
    }

    // Newton Method
    public boolean isPerfectSquareNewtonMethod(int num) {
        long x = num;

        while (x * x > num) {
            x = (x + num / x) / 2;
        }

        return x * x == num;
    }

}

