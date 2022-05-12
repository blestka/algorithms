package com.educative.problems.sliding_window;

import java.util.*;

public class NoRepeatSubstring {
    public static void main(String[] args) {
        assert findLength("aabccbb") == 3;
        assert findLength("abbbb") == 2;
        assert findLength("abccde") == 3;
    }

    public static int findLength(String str) {
        char[] arr = str.toCharArray();
        int windowStart = 0, maxLength = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            if (charIndexMap.containsKey(arr[windowEnd])) {
                windowStart = Math.max(windowStart, charIndexMap.get(arr[windowEnd]) + 1);
            }
            charIndexMap.put(arr[windowEnd], windowEnd);
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}
