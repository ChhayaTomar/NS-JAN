package com.company.mockDSA3.hard;
/*
Given an integer n, return the least number of perfect square numbers that sum to n.

A perfect square is an integer that is the square of an integer;
in other words, it is the product of some integer with itself.
For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.

Example 1:
Input: n = 12
Output: 3
Explanation: 12 = 4 + 4 + 4.

Example 2:
Input: n = 13
Output: 2
Explanation: 13 = 4 + 9.
 */
public class Ques3 {
    public static void main(String[] args) {
        int n=12;
        System.out.println("with recursion - " + totalSquares(n));
        System.out.println("with dp - " + minSquares(n));
    }
    //with recursion
    public static int totalSquares(int n){
        if(n<=3){
            return n;
        }
        int min=Integer.MAX_VALUE;
        for (int i = 1; i*i <=n ; i++) {
            min=Math.min(min, totalSquares(n-(i*i))+1);
        }
        return min;
    }

    //with dp
    public static int minSquares(int n){
        if(n<=3){
            return n;
        }

        int[] dp=new int[n+1];
        for (int i = 1; i <=n; i++) {
            dp[i]=Integer.MAX_VALUE;
            for (int j = 1; j*j<=i ; j++) {
                dp[i]=Math.min(dp[i],dp[i-j*j]+1);
            }
        }
        return dp[n];
    }
}
