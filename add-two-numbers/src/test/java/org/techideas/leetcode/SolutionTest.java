package org.techideas.leetcode;

import org.junit.jupiter.api.Test;
import org.techideas.leetcode.model.ListNode;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTest {

    Solution solution;

    //Input: l1 = [2,4,3], l2 = [5,6,4]
    //Output: [7,0,8]
    //Explanation: 342 + 465 = 807.
    @Test
    void caseOne() {
        //given
        var listNode1 = ListNode.of(2, 4, 3);
        var listNode2 = ListNode.of(5, 6, 4);
        var expectedList = List.of(7, 0, 8);

        //when
        var listNodeSum = solution.addTwoNumbers(listNode1, listNode2);

        //then
        assertThat(listNodeSum.getWholeList()).isEqualTo(expectedList);
    }

    //Input: l1 = [0], l2 = [0]
    //Output: [0]
    @Test
    void caseTwo() {
        //given
        var listNode1 = ListNode.of(0);
        var listNode2 = ListNode.of(0);
        var expectedList = List.of(0);

        //when
        var listNodeSum = solution.addTwoNumbers(listNode1, listNode2);

        //then
        assertThat(listNodeSum.getWholeList()).isEqualTo(expectedList);
    }

    //Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
    //Output: [8,9,9,9,0,0,0,1]
    @Test
    void caseThree() {
        //given
        var listNode1 = ListNode.of(9, 9, 9, 9, 9, 9, 9);
        var listNode2 = ListNode.of(9, 9, 9, 9);
        var expectedList = List.of(8, 9, 9, 9, 0, 0, 0, 1);

        //when
        var listNodeSum = solution.addTwoNumbers(listNode1, listNode2);

        //then
        assertThat(listNodeSum.getWholeList()).isEqualTo(expectedList);
    }
}
