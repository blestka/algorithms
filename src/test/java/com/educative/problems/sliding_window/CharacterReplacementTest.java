package com.educative.problems.sliding_window;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterReplacementTest
{
    @ParameterizedTest
    @MethodSource("provideStringsForCharacterReplacement")
    public void testCharacterReplacement(String str, int k, int expected)
    {
        assertEquals(expected, CharacterReplacement.findLength(str, k));
    }

    private static Stream<Arguments> provideStringsForCharacterReplacement() {
        return Stream.of(
                Arguments.of("aabccbb", 2, 5),
                Arguments.of("abbcb", 1, 4),
                Arguments.of("abccde", 1, 3)
        );
    }

}
