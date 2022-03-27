package com.company.contestSat26;

import java.util.Scanner;

public class Bulidings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int count=1;
        int high =arr[0];

        for(int i=1; i<n ; i++){
            if (arr[i]>high){
                high=arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
