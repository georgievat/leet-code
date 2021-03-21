package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItemsMatchingRule {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int counter = 0;
        int rule = 0;
        switch (ruleKey) {
            case "type":
                rule = 0;
                break;
            case "color":
                rule = 1;
                break;
            case "name":
                rule = 2;
                break;
        }
        for (int i = 0; i < items.size(); i++) {
            for (int j = 0; j < items.get(i).size(); j++) {
                String[] arr = items.get(i).get(j).split(",");
                if(arr[rule].equals(ruleValue)) {
                    counter++;
                }

            }
        }
        System.out.println(counter);
        return counter;
    }

    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        list.add("phone,blue,pixel");
        list1.add("computer,silver,phone");
        list2.add("phone,gold,iphone");
        list3.add("phone,blue,pixel");
        items.add(list);
        items.add(list1);
        items.add(list2);
        items.add(list3);

        countMatches(items, "name", "pixel");
    }
}

