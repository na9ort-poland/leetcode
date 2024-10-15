package org.techideas.leetcode.substring;

import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        var chars = s.toCharArray();
        var theLongestLength = 0;
        var theLongestString = "";

        for (int outerLoopIndex = 0; outerLoopIndex < chars.length; outerLoopIndex++) {
            var set = new HashSet<Character>();
            set.add(chars[outerLoopIndex]);

            for (int innerLoopIndex = outerLoopIndex + 1; innerLoopIndex < chars.length; innerLoopIndex++) {
                if (set.contains(chars[innerLoopIndex]) && set.size() > theLongestLength) {
                    theLongestLength = set.size();
                    theLongestString = set.toString();
                    break;
                }

                set.add(chars[innerLoopIndex]);
            }
        }

//        System.out.println("theLongestString = " + theLongestString);

        return theLongestLength;
    }
}