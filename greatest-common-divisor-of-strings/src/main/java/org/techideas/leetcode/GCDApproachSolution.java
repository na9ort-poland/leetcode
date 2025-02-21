package org.techideas.leetcode;

public class GCDApproachSolution implements Solution {

    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        var numberOne = Math.max(str1.length(), str2.length());
        var numberTwo = Math.min(str1.length(), str2.length());

        while (numberTwo != 0) {
            var temporary = numberTwo;
            numberTwo = numberOne % numberTwo;
            numberOne = temporary;
        }

        return str1.substring(0, numberOne);
    }
}
