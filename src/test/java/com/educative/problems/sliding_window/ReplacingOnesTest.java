package com.educative.problems.sliding_window;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReplacingOnesTest
{
    @ParameterizedTest
    @MethodSource("provideStringsForReplacingOnes")
    public void testReplacingOnes(int[] arr, int k, int expected)
    {
        assertEquals(expected, ReplacingOnes.findLength(arr, k));
    }

    private static Stream<Arguments> provideStringsForReplacingOnes() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1}, 2, 6),
                Arguments.of(new int[]{0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1}, 3, 9)
        );
    }

}
