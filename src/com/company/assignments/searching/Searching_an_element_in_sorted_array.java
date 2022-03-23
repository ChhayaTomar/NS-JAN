package com.company.assignments.searching;

import java.util.Scanner;

public class Searching_an_element_in_sorted_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            long k=sc.nextLong();
            int[] arr=new int[n];
            for (int j = 0; j < n; j++) {
                arr[i]=sc.nextInt();
            }
            System.out.println(isPresent(arr,n,k));
        }

    }
    ///Recursive approach
    public static int isPresent(int[] arr, int n, long k){
        return searchByRec(arr,k,0,n-1);
    }

    public static int searchByRec(int[] arr, long k, int l, int r){
        int mid=(l+r)/2;
        if(l>r) return -1;

        if(k==arr[mid]) return 1;
        else if(k<arr[mid]) return searchByRec(arr,k,l,mid-1);
        else return searchByRec(arr,k, mid+1,r);
    }
}
