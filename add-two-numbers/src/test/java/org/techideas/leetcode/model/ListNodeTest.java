package org.techideas.leetcode.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;


public class ListNodeTest {

    @ParameterizedTest
    @MethodSource("providerForShouldCreateProperOrderList")
    void shouldCreateProperOrderList(Integer[] numbersList, Integer[] expectedResult,
                                     Integer expectedListLength) {
        //given && when
        var head = ListNode.of(numbersList);

        //then
        assertThat(head.getNodeListLength()).isEqualTo(expectedListLength);
        assertThat(head.getWholeList()).containsExactly(expectedResult);
    }

    @Test
    void shouldReturnNodeListLengthTwice() {

    }

    private static Stream<Arguments> providerForShouldCreateProperOrderList() {
        return Stream.of(
                Arguments.of(new Integer[]{2, 4, 3}, new Integer[]{2, 4, 3}, 3),
                Arguments.of(new Integer[]{5, 6, 4}, new Integer[]{5, 6, 4}, 3),
                Arguments.of(new Integer[]{7, 0, 8}, new Integer[]{7, 0, 8}, 3),
                Arguments.of(new Integer[]{9, 9, 9, 9, 9, 9, 9}, new Integer[]{9, 9, 9, 9, 9, 9, 9}, 7),
                Arguments.of(new Integer[]{9, 9, 9, 9}, new Integer[]{9, 9, 9, 9}, 4),
                Arguments.of(new Integer[]{8, 9, 9, 9, 0, 0, 0, 1}, new Integer[]{8, 9, 9, 9, 0, 0, 0, 1}, 8)
//              ,  Arguments.of(new Integer[]{}, new Integer[]{}, 0)
//              ,  Arguments.of(null, null)
        );
    }
}
