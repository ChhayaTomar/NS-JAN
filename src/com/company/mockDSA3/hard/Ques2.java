package com.company.mockDSA3.hard;
/*
You are a professional robber planning to rob houses along a street.
Each house has a certain amount of money stashed.
All houses at this place are arranged in a circle.
That means the first house is the neighbor of the last one.
Meanwhile, adjacent houses have a security system connected,
and it will automatically contact the police
if two adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house,
return the maximum amount of money you can rob tonight without alerting the police.

Example 1:
Input: nums = [2,3,2]
Output: 3
Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because they are adjacent houses.
Example 2:
Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.
Example 3:

Input: nums = [1,2,3]
Output: 3

 */
public class Ques2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        int n=arr.length;
        int[] dp1=new int[n+2];
//        dp1[0]=0;
//        dp1[1]=arr[0];

        for (int i = n-2; i >=0 ; i--) {
            dp1[i]=Math.max((dp1[i+1]),(dp1[i+2] + arr[i]));
        }

        int[] dp2=new int[n+2];

        for (int i = n-1; i >0 ; i--) {
            dp2[i]=Math.max((dp2[i+1]), (dp2[i+2] + arr[i]));
        }

        System.out.println(Math.max(dp1[0], dp2[0]));

    }
}