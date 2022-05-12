package com.educative.problems.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class MaxFruitCountOf2Types {
    public static void main(String[] args) {
        assert findLength(new char[]{'A', 'B', 'C', 'A', 'C'}) == 3;
        assert findLength(new char[]{'A', 'B', 'C', 'B', 'B', 'C'}) == 5;
    }

    public static int findLength(char[] arr) {
        Map<Character, Integer> fruits = new HashMap<>();
        int windowStart = 0;
        int maxNumOfFruits = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            fruits.put(arr[windowEnd], fruits.getOrDefault(arr[windowEnd], 0) + 1);
            while (fruits.keySet().size() > 2) {
                fruits.put(arr[windowStart], fruits.get(arr[windowStart]) - 1);
                if (fruits.get(arr[windowStart]) == 0) {
                    fruits.remove(arr[windowStart]);
                }
                windowStart++;
            }
            maxNumOfFruits = Math.max(fruits.values().stream().mapToInt(Integer::intValue).sum(), maxNumOfFruits);
        }
        return maxNumOfFruits;
    }
}
