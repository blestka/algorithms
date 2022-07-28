package com.educative.problems.sliding_window;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringPermutationTest
{
    @ParameterizedTest
    @MethodSource("provideStringsForStringPermutation")
    public void testStringPermutation(String str, String pattern, boolean expected)
    {
        assertEquals(expected, StringPermutation.findPermutation(str, pattern));
    }

    private static Stream<Arguments> provideStringsForStringPermutation() {
        return Stream.of(
                Arguments.of("oidbcaf", "abc", true),
                Arguments.of("odicf", "dc", false),
                Arguments.of("bcdxabcdy", "bcdyabcdx", true),
                Arguments.of("aaacb", "abc", true)
        );
    }
}
