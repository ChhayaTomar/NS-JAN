package com.company.assignments.stack;

import java.util.Scanner;
import java.util.Stack;

public class Evaluate_Expression_Using_Stack {   //2 1 + 3 *
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=" ";
        for (int i = 0; i <n ; i++) {
            str+= sc.next()+ " ";
        }
        str=str.trim();
        String [] arr=str.split(" ");
        Stack<Integer> stack=new Stack<>();


        for (String c : arr) {
            if (!c.equals("+") && !c.equals("-") && !c.equals("*") && !c.equals("/")) {
                if (Integer.parseInt(c) >= 0 && Integer.parseInt(c) <= 500) {
                    stack.push(Integer.parseInt(c));
                }
            } else {
                int a = stack.pop();
                int b = stack.pop();

                switch (c) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(b - a);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(b / a);
                        break;
                }
            }
        }
        System.out.println(stack.pop());
    }
}
//        for (String c : arr)
//            if(c.equals("+")
//            || c.equals("-") || c.equals("*") || c.equals("/")){
//                int a=stack.pop();
//                int b=stack.pop();
//
//                switch(c){
//                    case "+":
//                        stack.push(a+b);
//                        break;
//                    case "-":
//                        stack.push(b-a);
//                        break;
//                    case "*":
//                        stack.push(a*b);
//                        break;
//                    case "/":
//                        stack.push(b/a);
//                        break;
//                }
//            }else{
//                if (Integer.parseInt(c) >= 0 && Integer.parseInt(c) <= 500) {
//                stack.push(Integer.parseInt(c));
//            }
//
//            }
//        System.out.println(stack.pop());
//    }
//}
