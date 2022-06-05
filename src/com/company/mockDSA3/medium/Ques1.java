package com.company.mockDSA3.medium;

public class Ques1 {
    public static void main(String[] args) {
        int m=3;
        int n=2;
        int[][] arr=new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n ; j++) {
                if(i+j==0){
                    arr[i][j]=1;
                }else{
                    arr[i][j]= ((i>0) ? arr[i-1][j]: 0)  + ((j>0) ? arr[i][j-1]: 0);
                }
            }
        }
        System.out.println(arr[m-1][n-1]);
    }
}
