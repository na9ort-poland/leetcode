package org.techideas.leetcode.substring.impl;

import org.techideas.leetcode.substring.Solution;

import java.util.HashSet;

public class SlidingWindowOfDistinctCharactersSolution implements Solution {

    @Override
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
            return s.length();
        }

        char[] chars = s.toCharArray();
        var startIndex = 0;
        var endIndex = 0;
        var lengthOfTheLongestSubstring = 0;
        var set = new HashSet<Character>();

        while (endIndex < chars.length) {
            if (set.contains(chars[endIndex])) {
                set.remove(chars[startIndex]);
                ++startIndex;
                continue;
            }

            lengthOfTheLongestSubstring = Math.max(endIndex - startIndex + 1, lengthOfTheLongestSubstring);
            set.add(chars[endIndex]);
            ++endIndex;
        }

        return lengthOfTheLongestSubstring;
    }
}
