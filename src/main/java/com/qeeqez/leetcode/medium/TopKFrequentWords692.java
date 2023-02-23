package com.qeeqez.leetcode.medium;

import java.util.*;

/**
 * 692. Top K Frequent Words
 * <p>
 * Given an array of strings words and an integer k, return the k most frequent strings.
 * <p>
 * Return the answer sorted by the frequency from highest to lowest.
 * Sort the words with the same frequency by their lexicographical order.
 */
public class TopKFrequentWords692 {

    // Fast, 100% CPU, 48% MEM
    public List<String> topKFrequent(String[] words, int k) {
        List<String> output = new ArrayList<>();

        Map<String, Integer> frequencyCount = new HashMap<>();
        for (String word : words) {
            frequencyCount.merge(word, 1, Integer::sum);
        }

        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                (a, b) -> Objects.equals(a.getValue(), b.getValue())
                        ? a.getKey().compareTo(b.getKey()) : b.getValue() - a.getValue()
        );

        for (Map.Entry<String, Integer> entry : frequencyCount.entrySet()) {
            pq.offer(entry);
        }

        for (int i = 0; i < k; i++) {
            output.add(Objects.requireNonNull(pq.poll()).getKey());
        }

        return output;
    }

}

