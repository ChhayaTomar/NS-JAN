package com.company.mockDSA2.hardAshimKaushal;

import java.util.Arrays;
import java.util.Stack;

/*
Given an array, print the Next Greater Element (NGE) for every element.
The Next greater Element for an element x is the first greater element on the right side of x in the array. Elements for which no greater element exist, consider the next greater element as -1.
 */
public class Ques1 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 25, 5};
        int[] newArr = nextGreaterElement(arr);
        System.out.println(Arrays.toString(newArr));
    }

    private static int[] nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] newArr = new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int i = 1;
        //4 5
        //0 1
        while (i < n) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                newArr[stack.pop()] = arr[i];
            }
            stack.push(i);
            i++;
        }

        while (!stack.isEmpty()) {
            newArr[stack.pop()] = -1;
        }
        return newArr;
    }
}
