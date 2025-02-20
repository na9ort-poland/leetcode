package org.techideas.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    void example_1() {
        //given
        var word1 = "abc";
        var word2 = "pqr";
        var solution = new Solution();

        //when
        var result = solution.mergeAlternately(word1, word2);

        //then
        Assertions.assertEquals("apbqcr", result);
    }

    @Test
    void example_2() {
        //given
        var word1 = "ab";
        var word2 = "pqrs";
        var solution = new Solution();

        //when
        var result = solution.mergeAlternately(word1, word2);

        //then
        Assertions.assertEquals("apbqrs", result);
    }

    @Test
    void example_3() {
        //given
        var word1 = "abcd";
        var word2 = "pq";
        var solution = new Solution();

        //when
        var result = solution.mergeAlternately(word1, word2);

        //then
        Assertions.assertEquals("apbqcd", result);
    }
}
