package com.educative.problems.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class NoRepeatSubstring
{
    public static int findLength(String str)
    {
        int maxLength = 0;
        int windowStart = 0;
        Map<Character, Integer> distinctChars = new HashMap<>();
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++)
        {
            char rightChar = str.charAt(windowEnd);
            if (distinctChars.containsKey(rightChar))
            {
                windowStart = Math.max(windowStart, distinctChars.get(rightChar) + 1);
            }
            distinctChars.put(str.charAt(windowEnd), windowEnd);
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}
