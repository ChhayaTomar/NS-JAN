package com.company.arena;

import java.util.Arrays;
import java.util.Scanner;

public class Count_duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n =sc.nextInt();
        int [ ] arr= new int [n];
        for(int i=0 ;i< n ;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        int count=1;

        for(int i=1 ;i<n;i++){
            int curr=arr[i];
            int prev= arr[i-1];
            if(curr==prev){
                count++;
            }
            else{
                if(count>1){
                    System.out.println(prev+" "+ count);
                }
                count=1;
            }
        }
        if(count>1) System.out.println(arr[n-1] + " " + count);
    }
}
