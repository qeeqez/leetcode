package com.qeeqez.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 1431. Kids With the Greatest Number of Candies
 * <p>
 * There are n kids with candies.
 * You are given an integer array candies,
 * where each candies[i] represents the number of candies the ith kid has,
 * and an integer extraCandies, denoting the number of extra candies that you have.
 * <p>
 * Return a boolean array result of length n,
 * where result[i] is true if, after giving the ith kid all the extraCandies,
 * they will have the greatest number of candies among all the kids, or false otherwise.
 * <p>
 * Note that multiple kids can have the greatest number of candies.
 */
public class KidsWithGreatestNumberCandies1431 {

    // 95% CPU, 90% MEM
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answer = new ArrayList<>();

        int maxValue = 0;
        for (int candy : candies) {
            maxValue = Math.max(maxValue, candy);
        }

        maxValue -= extraCandies;

        for (int candy : candies) {
            answer.add(candy >= maxValue);
        }
        return answer;
    }

}

