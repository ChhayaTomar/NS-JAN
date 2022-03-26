package com.company.assignments.stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Lexo_sequence {
    public static void main(String[] args) {
        int n=5;
        int k=4;
        long[] arr={12,2,1,3,4};
        Stack<Long> stack=new Stack<>();
        long minVal=arr[n-k];
        int index=n-k;

//        for (int i = n-k; i >=0 ; i++) {
//            stack.push(arr[i]);
//        }

//        String[] arr2={"Geeks", "or", "ks"};
//        Arrays.sort(arr2);
//        System.out.println(Arrays.toString(arr2));

//        Object[] arr3 = Arrays.stream(arr2).sorted().toArray();
//        System.out.println(Arrays.toString(arr3));


        /*for (int i = 0; i <=n-k ; i++) {
            if(stack.isEmpty()){
                stack.push(arr[i]);
            }else{
                if(arr[i]<stack.peek()){
                    stack.push(arr[i]);
                    minVal=arr[i];
                    index=i;
                }else{
                    continue;
                }
            }
        }
        for (int i = index; i <(index+k) ; i++) {
            System.out.print(arr[i] + " ");
        } */
    }
}
