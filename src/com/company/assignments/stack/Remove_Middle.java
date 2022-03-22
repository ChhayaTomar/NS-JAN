package com.company.assignments.stack;

import java.util.Stack;

public class Remove_Middle {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);


        double x=(int)(Math.ceil(s.size()/2));
        System.out.println(x);
        Stack<Integer> s1=new Stack<>();
        while((s.size()>x+1)){
            int a=s.pop();
            s1.push(a);
        }
        s.pop();

        while(s1.size()>0){
            int b=s1.pop();
            s.push(b);
        }



    }
}
