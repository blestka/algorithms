package com.educative.problems.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinct
{
    public static int findLength(String str, int k)
    {
        int maxLength = 0, windowStart = 0;
        Map<Character, Integer> charCount = new HashMap<>();
        for(int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            Integer endCharCount = charCount.getOrDefault(str.charAt(windowEnd), 0);
            charCount.put(str.charAt(windowEnd), endCharCount + 1);
            while (charCount.keySet().size() > k)
            {
                Integer startCharCount = charCount.get(str.charAt(windowStart));
                if(startCharCount > 1)
                    charCount.put(str.charAt(windowStart), startCharCount - 1);
                else
                    charCount.remove(str.charAt(windowStart));
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}

