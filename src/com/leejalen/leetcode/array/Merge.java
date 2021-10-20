package com.leejalen.leetcode.array;

/**
 * @author leejalen
 * Created on 2021/10/19
 * @Description leetcode-88：合并两个数组
 */
public class Merge {

    public static void main(String[] args) {

    }

    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            if (m == 0){
                nums1 = nums2;
                return;
            }
            if (n == 0){
                return;
            }
           int mPoint = m - 1;
           int nPoint = nums2.length - 1;
           while (mPoint >= 0 && nPoint >= 0){
               if (nums1[mPoint] < nums2[nPoint]){

               }
           }
        }
    }
}
