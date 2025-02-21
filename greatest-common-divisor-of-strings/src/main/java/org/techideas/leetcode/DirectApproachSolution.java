package org.techideas.leetcode;

public class DirectApproachSolution implements Solution {

    public String gcdOfStrings(String str1, String str2) {
        var minLength = Math.min(str1.length(), str2.length());
        var result = "";

        for (int i = 0; i < minLength; i++) {
            var token = str1.substring(0, i + 1);

            if (str1.replace(token, "").isEmpty()) {
                if (str2.replace(token, "").isEmpty()) {
                    result = token;
                }
            }
        }

        return result;
    }
}
