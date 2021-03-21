package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class DecompressRunLengthEncodedList {
    public static int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i++) {
            int freq = nums[i];
            int val = nums[i + 1];
            for (int j = 0; j < freq; j++) {
                list.add(val);
            }
            i++;
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {42,39};
        decompressRLElist(nums);
    }
}
