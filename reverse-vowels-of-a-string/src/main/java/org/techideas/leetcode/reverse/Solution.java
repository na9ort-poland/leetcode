package org.techideas.leetcode.reverse;

public class Solution {
    public String reverseVowels(String s) {
        var chars = s.toCharArray();
        for (int i = 0, j = s.length() - 1; i < s.length(); i++) {
            if (i >= j) {
                break;
            }

            var iLowerCaseChar = Character.toLowerCase(chars[i]);
            if (iLowerCaseChar == 'a' || iLowerCaseChar == 'e' || iLowerCaseChar == 'i'
                    || iLowerCaseChar == 'o' || iLowerCaseChar == 'u') {
                for (; j > 0; j--) {
                    var jLowerCaseChar = Character.toLowerCase(chars[j]);
                    if (jLowerCaseChar == 'a' || jLowerCaseChar == 'e' || jLowerCaseChar == 'i'
                            || jLowerCaseChar == 'o' || jLowerCaseChar == 'u') {
                        var temp = chars[i];
                        chars[i] = chars[j];
                        chars[j] = temp;
                        j--;
                        break;
                    }
                }
            }
        }

        return new String(chars);
    }
}