package org.techideas.leetcode.mergestrings;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        var word1Char = word1.toCharArray();
        var word2Char = word2.toCharArray();
        var length = Math.max(word1.length(), word2.length());

        var builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i < word1Char.length) {
                builder.append(word1Char[i]);
            }

            if (i < word2Char.length) {
                builder.append(word2Char[i]);
            }
        }

        return builder.toString();
    }
}