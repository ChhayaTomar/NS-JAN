package com.company.assignments.queue;

import java.util.Deque;
import java.util.LinkedList;

public class OperationsOnDeque {
    static void push_back_pb(Deque<Integer> dq, int x)
    {
        //Your code
        dq.addLast(x);

    }
    static void push_front_pf(Deque<Integer> dq, int x)
    {
        // Your code here
        dq.addFirst(x);

    }
    static void pop_back_ppb(Deque<Integer> dq)
    {
        // Your code here
        if(dq.isEmpty()) return;
        dq.removeLast();

    }
    static int front_dq(Deque<Integer> dq)
    {
        // Your code here
        if(dq.isEmpty()) return -1;
        return dq.peek();

    }
    public static void main(String[] args) {
        Deque<Integer> deque=new LinkedList<>(); //we can use ArrayDeque as well in place of LinkedList
        push_front_pf(deque,2);
        push_front_pf(deque, 3);
        push_back_pb(deque,5);
        System.out.println(front_dq(deque));
        pop_back_ppb(deque);
        System.out.println(front_dq(deque));


    }
}
