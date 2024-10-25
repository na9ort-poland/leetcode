package org.techideas.leetcode.median;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("providerForShouldReturnsProperMedianValueOfTwoMergedArrays")
    void shouldReturnsProperMedianValueOfTwoMergedArrays(int[] nums1, int[] nums2, double expectedMediaValue) {
        //given && when
        var medianValue = solution.findMedianSortedArrays(nums1, nums2);

        //then
        assertThat(medianValue).isEqualTo(expectedMediaValue);
    }

    static Stream<Arguments> providerForShouldReturnsProperMedianValueOfTwoMergedArrays() {
        return Stream.of(
                Arguments.of(new int[]{1, 3}, new int[]{2}, 2.00000f),
                Arguments.of(new int[]{1, 2}, new int[]{3, 4}, 2.50000f)
        );
    }
}
