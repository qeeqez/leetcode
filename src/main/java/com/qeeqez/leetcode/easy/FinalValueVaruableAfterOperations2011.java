package com.qeeqez.leetcode.easy;

/**
 * 2011. Final Value of Variable After Performing Operations
 * <p>
 * There is a programming language with only four operations and one variable X:
 * * ++X and X++ increments the value of the variable X by 1.
 * * --X and X-- decrements the value of the variable X by 1.
 * Initially, the value of X is 0.
 * <p>
 * Given an array of strings operations containing a list of operations,
 * return the final value of X after performing all the operations.
 */
public class FinalValueVaruableAfterOperations2011 {

    // Faster solution
    public int finalValueAfterOperations(String[] operations) {
        int output = 0;
        for (String operation : operations) {
            if (operation.charAt(1) == '+') output++;
            else output--;
        }
        return output;
    }

    // Normal solution
    public int finalValueAfterOperationsNormal(String[] operations) {
        int output = 0;
        for (String operation : operations) {
            switch (operation) {
                case "X++", "++X" -> output++;
                case "X--", "--X" -> output--;
            }
        }
        return output;
    }
}

