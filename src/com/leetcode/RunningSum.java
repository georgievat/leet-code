package com.leetcode;

public class RunningSum {
    public static int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i] += nums[j];
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        runningSum(arr);
    }
}
