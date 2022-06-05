package com.company.mockDSA3.medium;

public class Ques2 {
    public static void main(String[] args) {
        int m=3;
        int n=3;
        int[][] arr=new int[m][n];
        arr[1][1]=1;

        int[] dp=new int[m];


        for (int i = 0; i < m; i++) {
            int[] temp=new int[n];
            for (int j = 0; j <n ; j++) {
                if (i + j == 0 && arr[i][j] != 1) {
                    //arr[i][j]=1;
                    temp[j] = 1;
                    continue;
                }
                int right = 0;
                int down = 0;

                if (j == 0) {
                    down = dp[j];
                } else {
                    down = dp[j];
                    right = temp[j - 1];
                }

                if (arr[i][j] == 1) {
                    temp[j] = 0;
                    continue;
                }

                temp[j] = right + down;

            }
            for (int j = 0; j <n ; j++) {
                dp[j]=temp[j];
            }

//                else{
//                    if(arr[i][j]!=1){
//                        arr[i][j]= ((i>0) ? arr[i-1][j]: 0)  + ((j>0) ? arr[i][j-1]: 0);
//                    }
//                }
            }
        System.out.println(dp[m-1]);
    }
}
