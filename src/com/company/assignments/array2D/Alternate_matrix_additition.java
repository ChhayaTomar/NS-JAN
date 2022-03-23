package com.company.assignments.array2D;

import java.util.Scanner;

public class Alternate_matrix_additition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] twoDArray=new int[n][n];
        int sumOfBlack=0;
        int sumOfWhite=0;

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
//                twoDArray[i][j]=sc.nextInt();
                int num=sc.nextInt();
                if(((i+j)&1) ==0){
                    sumOfBlack+=num;
                }else{
                    sumOfWhite+=num;
                }
            }

        }
        System.out.println(sumOfBlack);
        System.out.println(sumOfWhite);
    }
}
