package com.educative.problems.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class MaxFruitCountOf2Types
{
    public static int findLength(char[] arr)
    {
        int maxNumOfFruits = 0, windowStart = 0;
        Map<Character, Integer> fruitsFrequency = new HashMap<>();
        for(int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            Integer endCharCount = fruitsFrequency.getOrDefault(arr[windowEnd], 0);
            fruitsFrequency.put(arr[windowEnd], endCharCount + 1);
            while (fruitsFrequency.keySet().size() > 2)
            {
                fruitsFrequency.put(arr[windowStart], fruitsFrequency.get(arr[windowStart]) - 1);
                if(fruitsFrequency.get(arr[windowStart]) == 0)
                    fruitsFrequency.remove(arr[windowStart]);
                windowStart++;
            }
            maxNumOfFruits = Math.max(maxNumOfFruits, windowEnd - windowStart + 1);
        }
        return maxNumOfFruits;
    }
}
