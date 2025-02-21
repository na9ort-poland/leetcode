package org.techideas.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    void example_1() {
        //given
        var str1 = "ABCABC";
        var str2 = "ABC";
        var solution = new Solution();

        //when
        var result = solution.gcdOfStrings(str1, str2);

        //then
        Assertions.assertEquals("ABC", result);
    }

    @Test
    void example_2() {
        //given
        var str1 = "ABABAB";
        var str2 = "ABAB";
        var solution = new Solution();

        //when
        var result = solution.gcdOfStrings(str1, str2);

        //then
        Assertions.assertEquals("AB", result);
    }

    @Test
    void example_3() {
        //given
        var str1 = "LEET";
        var str2 = "CODE";
        var solution = new Solution();

        //when
        var result = solution.gcdOfStrings(str1, str2);

        //then
        Assertions.assertEquals("", result);
    }
}
