package com.company.mockDSA2.medium;

/*
Q.Longest Common Prefix using Word by Word Matching.
Given a set of strings, find the longest common prefix.
Examples:


Input  : {“geeksforgeeks”, “geeks”, “geek”, “geezer”}
Output : "gee"

Input  : {"apple", "ape", "april"}
Output : "ap"
 */
public class Ques1 {
    public static void main(String[] args) {
        String[] arr = {"apple", "ape", "april"};
        int minLen = Integer.MAX_VALUE;

        for (String s : arr) {
            minLen = Math.min(s.length(), minLen);
        }
        String s = "";
        int i = 0;

        while (i < minLen) {
            char c = arr[0].charAt(i);
            boolean flag = true;
            for (int j = 1; j < arr.length; j++) {
                if (c != arr[j].charAt(i)) {
                    flag = false;
                    break;
                }
            }
            i++;
            if (flag) s = s + c;
        }
        System.out.println(s);
    }
}
