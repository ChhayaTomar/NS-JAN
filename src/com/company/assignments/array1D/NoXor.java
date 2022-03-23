package com.company.assignments.array1D;

import java.util.Scanner;

public class NoXor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        long sum=0;
        for (int i = 1; i <= n; i++) {
            long a=(long)((n-i)^array[i-1]);
            sum+=a;
        }
        System.out.println(sum);
    }
}
