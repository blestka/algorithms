package com.educative.problems.sliding_window;

/*
Given an array of positive numbers and a positive number ‘k,’ find the maximum sum of any contiguous subarray of size ‘k’.
*/
public class MaxSumSubArrayOfSizeK
{
    public static int findMaxSumSubArray(int k, int[] arr) {
        int maxSum = 0;
        int windowStart = 0;
        int sum = 0;
        for(int windowEnd = 0; windowEnd < arr.length; windowEnd++)
        {
            sum += arr[windowEnd];
            if(windowEnd - windowStart + 1 >= k)
            {
                maxSum = Math.max(maxSum, sum);
                sum = sum - arr[windowStart];
                windowStart++;
            }
        }
        return maxSum;

    }

    public static void main(String[] args) {
        System.out.println("Maximum sum of a subarray of size K: "
                + MaxSumSubArrayOfSizeK.findMaxSumSubArray(3, new int[] { 2, 1, 5, 1, 3, 2 }));
        System.out.println("Maximum sum of a subarray of size K: "
                + MaxSumSubArrayOfSizeK.findMaxSumSubArray(2, new int[] { 2, 3, 4, 1, 5 }));
    }

}
