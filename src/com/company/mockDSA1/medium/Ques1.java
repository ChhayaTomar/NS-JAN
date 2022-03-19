package com.company.mockDSA1.medium;

/*
Given an unsorted array of both negative and positive integer.
The task is place all negative element at the end of array
without changing the order of positive element and negative element.
        Examples:
        Input : arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
        Output : 1  3  2  11  6  -1  -7  -5

        Input : arr[] = {-5, 7, -3, -4, 9, 10, -1, 11}
        Output : 7  9  10  11  -5  -3  -4  -1*/

import java.util.ArrayList;

public class Ques1 {
    public static void main(String[] args) {
        int[] arr={1, -1, 3, 2, -7, -5, 11, 6 };
        int n=arr.length;
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]<0) neg.add(arr[i]);
            else pos.add(arr[i]);
        }
        pos.addAll(neg);
        System.out.println(pos);
    }
}
