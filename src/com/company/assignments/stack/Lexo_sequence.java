package com.company.assignments.stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Lexo_sequence {
    public static void main(String[] args) {
        int n=5;
        int k=2;
        long[] arr={12,2,1,3,4}; //n=5, k=4, n-k=1
        Stack<Integer> stack=new Stack<>();
        long  minVal=arr[0];
        int index=0;
        stack.push(0);
        for (int i = 0; i <=n-k; i++) {
            if(arr[stack.peek()]>arr[i]) {
                stack.push(i);
                minVal = arr[i];
                index = i;
            }
//            else if(!stack.isEmpty() && arr[stack.peek()]<arr[i]){
//                continue;
//            }else{
//                stack.push(i);
//            }
        }
        for (int i = index; i < index+k; i++) {
            System.out.print(arr[i]+ " ");
        }


    }
}
