package com.company.assignments.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Pair_Hate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String [] arr=str.split("");
        String top="";
        Arrays.sort(arr);

        Stack<String > stack=new Stack<>();
        ArrayList<String> list=new ArrayList<>();
        for(String s: arr){
            String a=stack.push(s);
            if(a.equals(top)){
                list.add(stack.pop());
                list.add(stack.pop());
            }else{
                stack.push(s);
                top=a;
            }
        }
        for(String i:list){
            System.out.print(i+" ");
        }

        for(int i=0;i<stack.size();i++){
            System.out.print(stack.pop());
        }
    }
}
