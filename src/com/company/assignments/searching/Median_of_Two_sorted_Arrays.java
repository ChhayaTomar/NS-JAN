package com.company.assignments.searching;

import java.util.Scanner;

public class Median_of_Two_sorted_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] res=mergeTwoSortedArrays(arr1, arr2, m, n);
        int median=res[(res.length-1)/2];
//        System.out.println(median);

        System.out.printf("%.2f", (float)median);
    }

    public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2, int m, int n) {
        int[] newArr = new int[m + n];
        int i = 0, j = 0;
        for (int k = 0; k <m+n ; k++) {
            if(i!=m && j!=n){
                newArr[k]= ((arr1[i]<arr2[j]) ? arr1[i++] : arr2[j++]);
            }else if(i!=m){
                newArr[k]=arr1[i++];
            }else{
                newArr[k]=arr2[j];
            }
        }
        return newArr;
    }
}
