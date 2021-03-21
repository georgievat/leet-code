package com.leetcode;
public class TargetArrayGivenOrder {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] res = new int[nums.length];
        boolean[] isHere = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(isHere[index[i]]) {
                for (int j = res.length - 1; j > index[i]; j--) {
                    res[j] = res[j - 1];
                }
                res[index[i]] = nums[i];
                isHere[i] = true;
            } else {
                res[index[i]] = nums[i];
                isHere[index[i]] = true;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {4,2,4,3,2};
        int[] index = {0,0,1,3,1};
        createTargetArray(nums, index);
    }
}
