package com.company.mockDSA1.mediumNihalShaikh;

/*
Given an array that contains both positive and negative integers,
find the product of the maximum product subarray.
Expected Time complexity is O(n) and only O(1) extra space can be used.
Examples:
Input: arr[] = {6, -3, -10, 0, 2}
Output:   180  // The subarray is {6, -3, -10}

Input: arr[] = {-1, -3, -10, 0, 60}
Output:   60  // The subarray is {60}

Input: arr[] = {-2, -40, 0, -2, -3}
Output:   80  // The subarray is {-2, -40}
 */

public class Ques2 {
    public static void main(String[] args) {
        int[] arr = {6, -3, -10, 0, 2};
        int n=arr.length;
        int result=arr[0];
        for(int i=0;i<arr.length;i++){
            int prod=arr[i];
//          if(arr[i]==0)
            for (int j = i+1; j <n; j++) {
                result=Math.max(result,prod);
                prod*=arr[j];
            }
            result=Math.max(result,prod);
        }
        System.out.println(result);
    }
}
