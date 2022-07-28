package com.educative.problems.sliding_window;

public class ReplacingOnes
{
    public static int findLength(int[] arr, int k)
    {
        int maxLength = 0, windowStart = 0;
        int oneFrequency = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++)
        {
            oneFrequency += arr[windowEnd];
            if (windowEnd - windowStart + 1 - oneFrequency > k)
            {
                oneFrequency -= arr[windowStart];
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}
