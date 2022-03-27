package com.company.assignments.stack;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Next_greater_frequency_element {
    Stack<Pair> mystack = new Stack<>();
    HashMap<Integer,Integer> mymap = new HashMap<>();

    class Pair{
        int data;
        int freq;
        Pair(int data,int freq){
            this.data = data;
            this.freq = freq;
        }
    }
    void NGF(int[] arr,int[] res) {
        int n = arr.length;
        for(int i = 0;i<n;i++) {
            if(mymap.containsKey(arr[i]))
                mymap.put(arr[i], mymap.get(arr[i]) + 1);
            else
                mymap.put(arr[i], 1);
        }
        int curr_freq = mymap.get(arr[n-1]);
        mystack.push(new Pair(arr[n-1],curr_freq));

        res[n-1] = -1;

        for(int i = n-2;i>=0;i--) {
            curr_freq = mymap.get(arr[i]);
            while(!mystack.isEmpty() && curr_freq >= mystack.peek().freq)
                mystack.pop();

            res[i] = (mystack.isEmpty()) ? -1 : mystack.peek().data;

            mystack.push(new Pair(arr[i],mymap.get(arr[i])));
        }
    }

    public static void main(String args[]) {
        Next_greater_frequency_element obj = new Next_greater_frequency_element();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int res[] = new int[arr.length];
        obj.NGF(arr, res);
        for(int i:res){
            System.out.print(i + " ");
        }
    }
}
