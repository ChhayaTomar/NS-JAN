package com.company.assignments.queue;

import java.util.LinkedList;

public class The_endgame {
    public static void slidingWindowMax(int[] arr, int n, int k){
        LinkedList<Integer> deque=new LinkedList<>();

        for (int i = 0; i<n ; i++) {
            while(!deque.isEmpty() && arr[deque.getLast()]<=arr[i]){
                deque.removeLast();
            }
            while(!deque.isEmpty() && deque.getFirst()<=i-k){
                deque.removeFirst();
            }
            deque.addLast(i);

            if(i>=k-1){
                System.out.print(arr[deque.getFirst()] + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,3,-1,-3,5,3,6,7};
        int n=arr.length;
        int k=3;
        slidingWindowMax(arr,n,k);
    }
}
