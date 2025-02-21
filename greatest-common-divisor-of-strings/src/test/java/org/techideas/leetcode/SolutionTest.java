package org.techideas.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private static final Solution solution = new GCDApproachSolution();

    @Test
    void example_1() {
        //given
        var str1 = "ABCABC";
        var str2 = "ABC";

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

        //when
        var result = solution.gcdOfStrings(str1, str2);

        //then
        Assertions.assertEquals("", result);
    }

    @Test
    void example_4() {
        //given
        var str1 = "ABABABAB";
        var str2 = "ABAB";

        //when
        var result = solution.gcdOfStrings(str1, str2);

        //then
        Assertions.assertEquals("ABAB", result);
    }

    @Test
    void example_5() {
        //given
        var str1 = "ABCDEF";
        var str2 = "ABC";

        //when
        var result = solution.gcdOfStrings(str1, str2);

        //then
        Assertions.assertEquals("", result);
    }
}
