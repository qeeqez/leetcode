package com.qeeqez.easy;

/**
 * 1518. Water Bottles
 * <p>
 * There are numBottles water bottles that are initially full of water.
 * You can exchange numExchange empty water bottles from the market with one full water bottle.
 * <p>
 * The operation of drinking a full water bottle turns it into an empty bottle.
 * <p>
 * Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.
 */
public class WaterBottles1518 {

    public int numWaterBottles(int numBottles, int numExchange) {
        int output = numBottles;
        while (numBottles >= numExchange) {
            output += numBottles / numExchange;
            numBottles = numBottles % numExchange + numBottles / numExchange;
        }
        return output;
    }

}

