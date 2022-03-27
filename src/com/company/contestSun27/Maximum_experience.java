package com.company.contestSun27;

import java.util.Scanner;

public class Maximum_experience {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] startTime = new int[n];
        int[] endTime = new int[n];
        int[] exp = new int[n];
        for(int i = 0 ; i< n ; i++){
            startTime[i] = sc.nextInt();
        }
        for(int i = 0 ; i< n ; i++){
            endTime[i] = sc.nextInt();
        }
        for(int i = 0 ; i< n ; i++){
            exp[i] = sc.nextInt();
        }

    }
}
