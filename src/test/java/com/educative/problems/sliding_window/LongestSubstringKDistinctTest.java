package com.educative.problems.sliding_window;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringKDistinctTest
{
    @ParameterizedTest
    @MethodSource("provideStringsForLongestSubstringKDistinct")
    public void testLongestSubstringKDistinct(String str, int k, int expected)
    {
        assertEquals(expected, LongestSubstringKDistinct.findLength(str, k));
    }

    private static Stream<Arguments> provideStringsForLongestSubstringKDistinct() {
        return Stream.of(
                Arguments.of("araaci", 2, 4),
                Arguments.of("araaci", 1, 2),
                Arguments.of("cbbebi", 3, 5),
                Arguments.of("cbbebi", 10, 6)
                );
    }

}
