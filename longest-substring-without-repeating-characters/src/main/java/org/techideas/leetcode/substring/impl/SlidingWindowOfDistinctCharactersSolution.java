package org.techideas.leetcode.substring.impl;

import org.techideas.leetcode.substring.Solution;

import java.util.HashSet;

public class SlidingWindowOfDistinctCharactersSolution implements Solution {

    @Override
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        var startIndex = 0;
        var endIndex = 1;
        var lengthOfTheLongestSubstring = 0;
        var set = new HashSet<Character>();

        set.add(chars[startIndex]);

        while (endIndex < chars.length) {
            System.out.printf("=====\nstartIndex = %d\nendIndex = %d\n=====%n", startIndex, endIndex);
            if (set.contains(chars[endIndex])) {
                ++startIndex;
                set.remove(chars[endIndex]);
                continue;
            }

            lengthOfTheLongestSubstring = Math.max(endIndex - startIndex, lengthOfTheLongestSubstring);
            set.add(chars[endIndex]);
            ++endIndex;
        }

        return lengthOfTheLongestSubstring + 1;
    }
}
