package com.educative.problems.sliding_window;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinSizeSubArraySumTest
{
    @ParameterizedTest
    @MethodSource("provideStringsForFindMinSubArray")
    public void testFindMinSubArray(int[] arr, int s, int expected)
    {
        assertEquals(expected, MinSizeSubArraySum.findMinSubArray(s, arr));
    }

    private static Stream<Arguments> provideStringsForFindMinSubArray() {
        return Stream.of(
                Arguments.of(new int[]{2, 1, 5, 2, 3, 2}, 7, 2),
                Arguments.of(new int[]{2, 1, 5, 2, 8}, 7, 1),
                Arguments.of(new int[]{3, 4, 1, 1, 6}, 8, 3)
        );
    }

}
