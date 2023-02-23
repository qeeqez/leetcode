package com.qeeqez.leetcode.easy;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 1046. Last Stone Weight
 * <p>
 * You are given an array of integers stones where stones[i] is the weight of the ith stone.
 * <p>
 * We are playing a game with the stones.
 * On each turn, we choose the heaviest two stones and smash them together.
 * Suppose the heaviest two stones have weights x and y with x <= y.
 * The result of this smash is:
 * <p>
 * If x == y, both stones are destroyed, and
 * If x != y, the stone of weight x is destroyed,
 * and the stone of weight y has new weight y - x.
 * At the end of the game, there is at most one stone left.
 * <p>
 * Return the weight of the last remaining stone.
 * If there are no stones left, return 0.
 */
public class LastStoneWeight1046 {

    @SuppressWarnings("DataFlowIssue")
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1) return stones[0];

        Queue<Integer> stoneHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int weight : stones) {
            stoneHeap.add(weight);
        }
        while (stoneHeap.size() > 1) {
            int biggest = stoneHeap.poll();
            int big = stoneHeap.poll();
            if (biggest != big) {
                stoneHeap.add(biggest - big);
            }
        }

        return stoneHeap.size() == 0 ? 0 : stoneHeap.peek();
    }
}

