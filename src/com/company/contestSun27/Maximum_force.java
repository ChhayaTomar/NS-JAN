package com.company.contestSun27;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_force {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] arr = new long[n];
        int a;
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            arr[i] = Math.abs(a);
        }
        long force = 0;
        Arrays.sort(arr);
        int j = n - 1;
        for (int i = 0; i < k; i++) {
            force = force + (arr[j] * arr[j]);
            j--;
        }
        System.out.println(force);
    }
}
