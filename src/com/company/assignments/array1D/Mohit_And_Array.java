package com.company.assignments.array1D;

import java.util.Scanner;

public class Mohit_And_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] array = new int[n-1];
        int sum=0;
        for(int i=0;i<n-1;i++){
            array[i]=sc.nextInt();
            sum+=array[i];
        }

        int x=(n*(n+1)/2)-sum;
        System.out.println(x);
    }
}
