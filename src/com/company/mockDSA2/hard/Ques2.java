package com.company.mockDSA2.hard;

// Leetcode Ques 151 :- https://leetcode.com/problems/reverse-words-in-a-string/

public class Ques2 {
    public static void main(String[] args) {
        String s="the sky is blue";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        s=s.trim();
        String[] sArr=s.split(" ");
        String s2="";

        for(int i=sArr.length-1; i>=0;i--){
            if(sArr[i].length() !=0){
                s2+=sArr[i] + " ";
            }
        }

        s2=s2.trim();
        return s2;
    }
}
