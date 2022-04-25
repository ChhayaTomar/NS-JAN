package com.company.mockDSA2.mediumManishShaw;

import java.util.ArrayList;


/*
Print All Possible Valid Combinations Of Parenthesis of Given ‘N’
Objec­tive: – Given “n”, generate all valid parenthesis strings of length “2n”.
Example:
Given n=2
Output:
(())
()()
For n=3
Output:
((()))
(()())
(())()
()(())
()()()
 */

public class Ques3 {
    public static void main(String[] args) {
        int n = 3;
        ArrayList<String> res = new ArrayList<>();
        allStr(res, "(", n, 1, 0);
        System.out.println(res);
    }

    public static void allStr(ArrayList<String> res, String curr, int n, int open, int close) {
        if (curr.length() == 2 * n) {
            res.add(curr);
            return;
        }
        if (open < n) allStr(res, curr + "(", n, open + 1, close);
        if (close < open) allStr(res, curr + ")", n, open, close + 1);
    }
}
