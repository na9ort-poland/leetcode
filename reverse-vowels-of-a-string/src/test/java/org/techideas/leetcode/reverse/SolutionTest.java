package org.techideas.leetcode.reverse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    void example_1() {
        //given
        var s = "IceCreAm";
        var solution = new Solution();

        //when
        var result = solution.reverseVowels(s);

        //then
        Assertions.assertEquals("AceCreIm", result);
    }

    @Test
    void example_2() {
        //given
        var s = "leetcode";
        var solution = new Solution();

        //when
        var result = solution.reverseVowels(s);

        //then
        Assertions.assertEquals("leotcede", result);
    }
}