package org.techideas.leetcode.flowers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    @Test
    void example_1() {
        //given
        var flowerbed = new int[]{1, 0, 0, 0, 1};
        var n = 1;
        var solution = new Solution();

        //when
        var result = solution.canPlaceFlowers(flowerbed, n);

        //then
        assertTrue(result);
    }

    @Test
    void example_2() {
        //given
        var flowerbed = new int[]{1, 0, 0, 0, 1};
        var n = 2;
        var solution = new Solution();

        //when
        var result = solution.canPlaceFlowers(flowerbed, n);

        //then
        assertFalse(result);
    }
}
