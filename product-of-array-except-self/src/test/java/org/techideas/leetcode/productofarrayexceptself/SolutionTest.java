package org.techideas.leetcode.productofarrayexceptself;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    void example_1() {
        //given
        var nums = new int[]{1, 2, 3, 4};
        var solution = new Solution();
        var expectedResult = new int[]{24, 12, 8, 6};

        //when
        var result = solution.productExceptSelf(nums);

        //then
        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    void example_2() {
        //given
        var nums = new int[]{-1, 1, 0, -3, 3};
        var solution = new Solution();
        var expectedResult = new int[]{0, 0, 9, 0, 0};

        //when
        var result = solution.productExceptSelf(nums);

        //then
        Assertions.assertArrayEquals(expectedResult, result);
    }
}