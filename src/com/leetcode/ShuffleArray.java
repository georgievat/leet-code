package com.leetcode;

public class ShuffleArray {
    public static int[] shuffle(int[] nums, int n) {
        //StringBuilder sb = new StringBuilder();
        int[] arr = new int[nums.length];
        int counter = 0;
        for (int i = 0; i < n; i++) {
            arr[counter] = nums[i];
            counter++;
            arr[counter] = nums[nums.length / 2 + i];
            counter++;
           //sb.append(nums[i]).append(nums[nums.length / 2 + i]);
        }
       // System.out.println(sb);
        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        shuffle(nums, 3);
    }
}
