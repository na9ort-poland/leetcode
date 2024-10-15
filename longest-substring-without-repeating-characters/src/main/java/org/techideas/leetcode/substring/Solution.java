package org.techideas.leetcode.substring;

import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
            return s.length();
        }

        var chars = s.toCharArray();
        var theLongestLength = -1;
//        var theLongestString = "";
        var set = new HashSet<Character>();

        for (int outerLoopIndex = 0; outerLoopIndex < chars.length; outerLoopIndex++) {
            set = new HashSet<>();
            set.add(chars[outerLoopIndex]);

            for (int innerLoopIndex = outerLoopIndex + 1; innerLoopIndex < chars.length; innerLoopIndex++) {
                if (set.contains(chars[innerLoopIndex])) {
                    break;
                }

                set.add(chars[innerLoopIndex]);

                if (set.size() > theLongestLength) {
                    theLongestLength = set.size();
//                    theLongestString = set.toString();
                }
            }
        }

//        System.out.println("theLongestString = " + theLongestString);

        return theLongestLength == -1 ? set.size() : theLongestLength;
    }
}