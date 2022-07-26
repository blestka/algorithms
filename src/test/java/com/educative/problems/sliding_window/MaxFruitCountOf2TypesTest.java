package com.educative.problems.sliding_window;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxFruitCountOf2TypesTest
{
    @ParameterizedTest
    @MethodSource("provideStringsForMaxFruitCountOf2Types")
    public void testMaxFruitCountOf2Types(char[] arr, int expected)
    {
        assertEquals(expected, MaxFruitCountOf2Types.findLength(arr));
    }

    private static Stream<Arguments> provideStringsForMaxFruitCountOf2Types() {
        return Stream.of(
                Arguments.of(new char[]{'A', 'B', 'C', 'A', 'C'}, 3),
                Arguments.of(new char[]{'A', 'B', 'C', 'B', 'B', 'C'}, 5)
        );
    }
}
