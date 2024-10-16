package org.techideas.leetcode.substring;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.techideas.leetcode.substring.impl.StartingFromEveryIndexSolution;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;


public class SolutionTest {

    Solution solution = new StartingFromEveryIndexSolution();

    @ParameterizedTest
    @MethodSource(value = "providerForShouldReturnLengthOfTheLongestSubstring")
    void shouldReturnLengthOfTheLongestSubstring(String input, int expectedLength) {
        //given && when
        var length = solution.lengthOfLongestSubstring(input);

        //then
        assertThat(length).isEqualTo(expectedLength);
    }

    private static Stream<Arguments> providerForShouldReturnLengthOfTheLongestSubstring() {
        return Stream.of(
                //Explanation: The answer is "abc", with the length of 3.
                Arguments.of("abcabcbb", 3),

                //Explanation: The answer is "b", with the length of 1.
                Arguments.of("bbbbb", 1),

                //Explanation: The answer is "wke", with the length of 3.
                //Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
                Arguments.of("pwwkew", 3),

                //LeetCode Validation Tests
                Arguments.of(" ", 1),
                Arguments.of("au", 2)
        );
    }
}
