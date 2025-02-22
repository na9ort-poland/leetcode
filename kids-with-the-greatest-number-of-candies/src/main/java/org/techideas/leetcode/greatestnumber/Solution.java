package org.techideas.leetcode.greatestnumber;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        var max = IntStream.of(candies).max().getAsInt();
        var result = new ArrayList<Boolean>();

        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }

        return result;
    }
}