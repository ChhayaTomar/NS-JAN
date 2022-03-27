package com.company.assignments.stack;

import java.util.Scanner;
import java.util.Stack;

public class Prefix_To_Infix {
    static boolean isOperator(char x)
    {
        switch(x)
        {
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
            case '%':
                return true;
        }
        return false;
    }
    public static String convert(String str)
    {
        Stack<String> stack = new Stack<>();

        // Length of expression
        int l = str.length();

        // Reading from right to left
        for(int i = l - 1; i >= 0; i--)
        {
            char c = str.charAt(i);
            if (isOperator(c))
            {
                String op1 = stack.pop();
                String op2 = stack.pop();

                // Concat the operands and operator
                String temp = "(" + op1 + c + op2 + ")";
                stack.push(temp);
            }
            else
            {

                // To make character to string
                stack.push(c + "");
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(convert(str));
    }
}
