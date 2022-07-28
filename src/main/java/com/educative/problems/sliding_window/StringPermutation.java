package com.educative.problems.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class StringPermutation
{
    public static boolean findPermutation(String str, String pattern)
    {
        int windowStart = 0, matches = 0;
        Map<Character, Integer> charFrequency = strAsMap(pattern);
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd ++)
        {
            Character rightChar = str.charAt(windowEnd);
            if(charFrequency.containsKey(rightChar))
            {
                charFrequency.put(rightChar, charFrequency.get(rightChar) - 1);
                if(charFrequency.get(rightChar) == 0)
                    matches++;
            }


            if(matches == charFrequency.keySet().size())
                return true;

            if(windowEnd - windowStart + 1 >= pattern.length())
            {
                Character leftChar = str.charAt(windowStart);
                if(charFrequency.containsKey(leftChar))
                {
                    if (charFrequency.get(leftChar) == 0)
                        matches--;
                    charFrequency.put(leftChar, charFrequency.get(leftChar) + 1);
                }
                windowStart++;
            }
        }
        return false;
    }

    private static Map<Character, Integer> strAsMap(String str)
    {
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < str.length(); i ++)
        {
            result.put(str.charAt(i), result.getOrDefault(str.charAt(i), 0) + 1);
        }
        return result;
    }
}
