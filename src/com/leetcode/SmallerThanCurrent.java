package com.leetcode;

public class SmallerThanCurrent {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] > nums[j]) {
                    counter++;
                }
            }
            arr[i] = counter;
            counter = 0;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        smallerNumbersThanCurrent(arr);
    }
}
