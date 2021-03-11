package com.ooftf.algorithm.leetcode;

/**
 * https://leetcode-cn.com/problems/median-of-two-sorted-arrays/
 */
public class FindMedianSortedArraysSolution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sumLength = (nums1.length + nums2.length);
        int left;
        int right;
        if (sumLength % 2 == 0) {//双数
            right = sumLength / 2;
            left = right - 1;
        } else {//单数
            left = sumLength / 2;
            right = left;
        }
        int index = 0;
        int leftValue = 0;
        int rightValue = 0;
        for (int i = 0, j = 0; i < nums1.length || j < nums2.length; ) {
            if (j >= nums2.length || (i < nums1.length && j < nums2.length && nums1[i] < nums2[j])) {
                if (index == left) {
                    leftValue = nums1[i];
                }
                if (index == right) {
                    rightValue = nums1[i];
                    break;
                }
                i++;
            } else {
                if (index == left) {
                    leftValue = nums2[j];
                }
                if (index == right) {
                    rightValue = nums2[j];
                    break;
                }
                j++;

            }
            index++;
        }
        return (leftValue + rightValue) / 2d;
    }
}
