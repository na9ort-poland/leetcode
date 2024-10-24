package org.techideas.leetcode.substring.impl;

import org.techideas.leetcode.substring.Solution;

public class LastIndexOfEachCharacterSolution implements Solution {



    @Override
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
            return s.length();
        }

        var chars = s.toCharArray();
        var endIndex = 0;
        var startIndex = 0;
        var lengthOfTheLongestSubstring = 0;

        var charactersLastIndex = new int[256];
        for (int i = 0; i < 256; i++) {
            charactersLastIndex[i] = -1;
        }

        while (endIndex < chars.length) {
            startIndex = Math.max(startIndex, charactersLastIndex[chars[endIndex]] + 1);

            charactersLastIndex[chars[endIndex]] = endIndex;
            lengthOfTheLongestSubstring = Math.max(endIndex - startIndex + 1, lengthOfTheLongestSubstring);
            ++endIndex;
        }

        return lengthOfTheLongestSubstring;
    }
}
