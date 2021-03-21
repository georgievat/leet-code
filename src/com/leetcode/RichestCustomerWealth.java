package com.leetcode;

public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int wealth = 0;
        int tempWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                tempWealth += accounts[i][j];
            }
            if(wealth < tempWealth) {
                wealth = tempWealth;
            }
            tempWealth = 0;
        }
        System.out.println(wealth);
        return wealth;
    }
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        maximumWealth(accounts);
    }
}
