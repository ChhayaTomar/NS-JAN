package com.company.advanceDSAtest;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Mean_array {
    static int getPairsCount(int arr[], int n, int k)
    {
        HashMap<Integer,Integer> m = new HashMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (m.containsKey(2*k - arr[i])) {
                count += m.get(2*k - arr[i]);
            }
            if(m.containsKey(arr[i])){
                m.put(arr[i], m.get(arr[i])+1);
            }
            else{
                m.put(arr[i], 1);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println(getPairsCount(arr,n,k));
    }
}
