package com.company.mockDSA2.challenge;

//Leetcode ques 3 :- https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/

import java.util.HashSet;

public class Ques4 {
    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    private static int lengthOfLongestSubstring(String s) {
        if(s.length()<=1) return s.length();
        HashSet<Character> set=new HashSet<>();
        int i=0;
        int start=0;
        int maxlen=Integer.MIN_VALUE;
        while (i<s.length()){
            char c=s.charAt(i);
            if(!set.contains(c)){
                set.add(c);
                i++;
                maxlen=Math.max(set.size(),maxlen);
            }else{
                set.remove(s.charAt(start));
                start++;
            }
        }
        return maxlen;
    }
}
