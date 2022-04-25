package com.company.advanceDSAtest;

import java.util.Scanner;

public class Minimum_operation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int x=1;
        int y=1;
        int count=0;

//        while(x!=n && y!=n){
//            if(n%2!=0) {
//               if(x%2!=0) {
//                   x = x + y;
//                   count++;
//               }else{
//                   y=x+y;
//                   count++;
//               }
//            } else {
//                if(x%2==0) {
//                    x = x + y;
//                    count++;
//                }else{
//                    y=x+y;
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);

        while(x<n && y<n){
            if(x<=y){
                x = x+y;
            } else{
                y = x+y;
            }
            count++;
        }
        if(n<100000)
            System.out.print(count);
        else
            System.out.print(count+1);
    }
}
