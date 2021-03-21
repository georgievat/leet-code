package com.leetcode;

public class DefangingIPAddress {
    public static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if(address.charAt(i) == '.') {
                sb.append('[').append('.').append(']');
            } else {
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String address = "1.1.1.1";
        defangIPaddr(address);
    }
}
