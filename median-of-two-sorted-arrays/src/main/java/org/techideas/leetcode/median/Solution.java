package org.techideas.leetcode.median;

import java.util.Arrays;

public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        var mergedNums = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, mergedNums, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedNums, nums1.length, nums2.length);

        Arrays.sort(mergedNums);
        var index = (mergedNums.length / 2);

        if (mergedNums.length % 2 == 0) {
            return (mergedNums[index] + mergedNums[index - 1]) / 2.0;
        }

        return mergedNums[index];
    }
}
