package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GreatestNumberCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        boolean hasGreatest = true;
        List<Boolean> list = new ArrayList<Boolean>();;
        for (int i = 0; i < candies.length; i++) {
            for (int j = 0; j < candies.length; j++) {
                if (candies[i] + extraCandies < candies[j]) {
                    hasGreatest = false;
                    break;
                }
            }

            list.add(hasGreatest);
            hasGreatest = true;
        }
        return list;
    }
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        kidsWithCandies(candies, 3);
    }
}
