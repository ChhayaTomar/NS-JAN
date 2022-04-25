package com.company.dsa21904;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Zig_zag_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=n/2;
        int[] arr = new int[n];
        int[] arr1 = new int[m];
        int[] arr2 = new int[m];


        for(int i=0;i<n;i+=2){
            arr[i]=sc.nextInt();
        }

        int x=0;
        for(int i=0;i<n;i+=2){
            arr1[x]=arr[i];
            x++;
        }
        // 5 1 5 6
        int y=0;
        for(int i=1;i<n;i+=2){
            arr2[y]=arr[i];
            y++;
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        HashMap<Integer,Integer> hmap1=new HashMap<>();
        HashMap<Integer, Integer> hmap2=new HashMap<>();

    }
}
