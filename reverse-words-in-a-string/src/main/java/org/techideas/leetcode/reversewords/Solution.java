package org.techideas.leetcode.reversewords;

public class Solution {
    public String reverseWords(String s) {
        var chars = (" " + s + " ").toCharArray();
        var beginWordIndex = -1;
        var endWordIndex = chars.length;
        var builder = new StringBuilder();

        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == ' ') {
                    if (beginWordIndex != -1) {
                        builder.append(chars, beginWordIndex, endWordIndex - beginWordIndex).append(" ");
                        beginWordIndex = -1;
                    }
                    endWordIndex = i;
            }
            else {
                beginWordIndex = i;
            }
        }

        return builder.deleteCharAt(builder.lastIndexOf(" ")).toString();
    }
}