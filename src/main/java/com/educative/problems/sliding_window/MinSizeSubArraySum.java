package com.educative.problems.sliding_window;

/*
Given an array of positive integers and a number ‘S,’ find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’. Return 0 if no such subarray exists.
*/
public class MinSizeSubArraySum
{
    public static int findMinSubArray(int S, int[] arr)
    {
        int minSize = arr.length + 1;
        int windowStart = 0;
        int sum = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++)
        {
            sum += arr[windowEnd];
            while (sum >= S)
            {
                minSize = Math.min(minSize, windowEnd - windowStart + 1);
                sum -= arr[windowStart];
                windowStart++;
            }
        }
        return minSize == arr.length + 1 ? 0 : minSize;

    }

}
