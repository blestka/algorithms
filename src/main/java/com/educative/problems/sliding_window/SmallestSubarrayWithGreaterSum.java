package com.educative.problems.sliding_window;

public class SmallestSubarrayWithGreaterSum {
    public static void main(String[] args) {
        assert findMinSubArray(7, new int[]{2, 1, 5, 2, 3, 2}) == 2;

    }

    public static int findMinSubArray(int S, int[] arr) {
        int windowStart = 0;
        int windowEnd = 0;
        int windowSum = arr[0];
        int min = arr.length + 1;
        while (windowEnd < arr.length) {
            if (windowSum >= S) {
                if ((windowEnd - windowStart + 1) < min) {
                    min = windowEnd - windowStart + 1;
                }
                if (min == 1) {
                    return min;
                }
                windowSum -= arr[windowStart];
                windowStart++;
            } else {
                windowEnd++;
                windowSum = windowEnd < arr.length ? windowSum + arr[windowEnd] : windowSum;
            }
        }
        return min == (arr.length + 1) ? 0 : min;
    }
}
