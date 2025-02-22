package org.techideas.leetcode.greatestnumber;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTest {

    @Test
    void example_1() {
        //given
        var candies = new int[]{2, 3, 5, 1, 3};
        var extraCandies = 3;
        var solution = new Solution();

        //when
        var result = solution.kidsWithCandies(candies, extraCandies);

        //then
        assertThat(result).isEqualTo(List.of(true,true,true,false,true));
    }

    @Test
    void example_2() {
        //given
        var candies = new int[]{4,2,1,1,2};
        var extraCandies = 1;
        var solution = new Solution();

        //when
        var result = solution.kidsWithCandies(candies, extraCandies);

        //then
        assertThat(result).isEqualTo(List.of(true,false,false,false,false));
    }

    @Test
    void example_3() {
        //given
        var candies = new int[]{12,1,12};
        var extraCandies = 10;
        var solution = new Solution();

        //when
        var result = solution.kidsWithCandies(candies, extraCandies);

        //then
        assertThat(result).isEqualTo(List.of(true,false,true));
    }
}
