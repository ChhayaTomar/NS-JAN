package com.company.assignments.stack;

import java.util.Stack;

public class Longestt_valid_parenthesis {
    public static void main(String[] args) {
        String s=")(())())";
        int n=s.length();

//        Create a stack and push -1 as initial index to it.
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        int result=0;
        
        //Traverse all characters of given string
        for (int i = 0; i <n ; i++) {
            if(s.charAt(i) =='('){
                stack.push(i);
            }else{
                if(!stack.isEmpty()){
                    stack.pop();
                }

                //we can use stack.empty() as well, both are similar just the name is different
                if (!stack.isEmpty()){
                    /* Check if this length formed with base of current valid substring
                     is more than max so far */
                    result = Math.max(result, i - stack.peek());
                } else{
                    stack.push(i);
                }
            }
            
        }
        System.out.println(result);
    }
}
