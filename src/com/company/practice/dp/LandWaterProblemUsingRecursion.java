package com.company.practice.dp;
//05-06-2022, Sunday
//Island Problem
// 0-Land, 1-water
public class LandWaterProblemUsingRecursion {
    public static void main(String[] args) {
        int[][] body={{1,1,1,0,0},
                      {1,1,1,0,0},
                      {0,1,1,1,1},
                      {0,1,1,0,1},
                      {0,1,1,1,0}};

        int islandCount=0;
        for (int i = 0; i <body.length; i++) {
            for (int j = 0; j <body[0].length ; j++) {
                if(body[i][j]==0){
                    islandCount++;
                    countLand(i,j,body);
                }
            }
        }
        System.out.println(islandCount);
    }
    private static void countLand(int x, int y, int[][] body){
        if(x<0 || y<0 || x== body.length || y==body[0].length || body[x][y]==1){
            return;
        }

        body[x][y]=1;
        countLand(x,y+1,body); //East
        countLand(x-1,y,body); //West
        countLand(x-1,y,body); //North
        countLand(x+1,y,body); //South
    }
}
