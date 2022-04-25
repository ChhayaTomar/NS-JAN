package com.company.mockDSA2.challenge;

//Leetcode ques 225 :- https://leetcode.com/problems/implement-stack-using-queues/

import java.util.LinkedList;
import java.util.Queue;

public class Ques2 {
    static Queue<Integer> queue1;
    static Queue<Integer> queue2;
    public Ques2() {
        queue1=new LinkedList<>();
        queue2=new LinkedList<>();
    }

    public void push(int x) {
        while(!queue1.isEmpty()){
            queue2.add(queue1.remove());
        }
        queue1.add(x);
        while(!queue2.isEmpty()){
            queue1.add(queue2.remove());
        }
    }

    public int pop() {
        return queue1.remove();
    }

    public int top() {
        return queue1.peek();
    }

    public boolean empty() {
        if(queue1.isEmpty()) return true;
        return false;
    }

    public static void main(String[] args) {
        Ques2 stack=new Ques2();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.top());
    }

}
