package com.company.mockDSA2.challenge;

//Leetcode Ques 20 :- https://leetcode.com/problems/valid-parentheses/

import java.util.Stack;

public class Ques1 {
    public static void main(String[] args) {
        String s="()[]{}";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(c=='(' || c== '[' || c=='{'){
                stack.push(c);
            }else if(c==')'){
                if(stack.isEmpty()) return false;
                if(stack.peek() != '(') return false;
                stack.pop();
            }else if(c==']'){
                if(stack.isEmpty()) return false;
                if(stack.peek() != '[') return false;
                stack.pop();
            }else{
                if(stack.isEmpty()) return false;
                if(stack.peek() != '{') return false;
                stack.pop();
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}
