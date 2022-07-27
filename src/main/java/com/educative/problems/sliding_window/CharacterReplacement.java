package com.educative.problems.sliding_window;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class CharacterReplacement
{
    public static int findLength(String str, int k)
    {
        int maxLength = 0, windowStart = 0, maxCharFrequency = 0;
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++)
        {
            charFrequencyMap.put(str.charAt(windowEnd), charFrequencyMap.getOrDefault(str.charAt(windowEnd), 0) + 1);
            maxCharFrequency = Math.max(maxCharFrequency, charFrequencyMap.get(str.charAt(windowEnd)));
            if (windowEnd - windowStart + 1 - maxCharFrequency > k)
            {
                int leftCharFrequency = charFrequencyMap.get(str.charAt(windowStart));
                charFrequencyMap.put(str.charAt(windowStart), leftCharFrequency - 1);
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }

}
