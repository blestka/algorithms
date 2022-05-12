package com.educative.problems.sliding_window;

import java.util.LinkedList;
import java.util.List;

public class LongestSubstringKDistinct {
    public static void main(String[] args) {
        assert findLength("araaci", 2) == 4;
        assert findLength("araaci", 1) == 2;
        assert findLength("cbbebi", 3) == 5;
        assert findLength("cbbebi", 10) == 6;
    }

    public static int findLength(String str, int k) {
        char[] arr = str.toCharArray();
        int windowStart = 0;
        int windowEnd = 0;
        int maxLength = 1;
        List<Character> list = new LinkedList<>();
        list.add(arr[0]);
        while (windowEnd < arr.length) {
            long tempLength = list.stream().distinct().count();
            if(tempLength == k) {
                maxLength = Math.max(windowEnd - windowStart + 1, maxLength);
            }
            if (tempLength <= k) {
                if((windowStart ==0) && (windowEnd == arr.length - 1)) {
                    return arr.length;
                }
                windowEnd++;
                if(windowEnd < arr.length) {
                    list.add(arr[windowEnd]);
                }
            }
            if (tempLength > k) {
                windowStart++;
                list.remove(0);
            }
        }
        return maxLength;
    }
}
