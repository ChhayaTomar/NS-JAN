package com.company.assignments.searching;

import java.util.Scanner;

public class Smaller_elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int q=sc.nextInt();
        int[] query=new int[n];
        for(int i=0;i<q;i++){
            query[i]=sc.nextInt();
        }
        for(int i=0;i<q;i++){
            System.out.println(smallerElements(a, n, query[i]));
        }
    }
    static int smallerElements(int a[], int n, int k){
        //Enter your code here
        return binarySearch(a, k, 0, n-1);

    }
    //Recursion
//    public static int binarySearch(int[] a,int k, int l, int r){
//        if(l>r){
//            return r+1;
//        }
//        int mid=(l+r)/2;
//        if(k==a[mid]) return mid+1;
//        else if(k<a[mid]) return binarySearch(a,k,l,mid-1);
//        else return binarySearch(a,k,mid+1,r);
//    }

    //Iteration
    public static int binarySearch(int[] a,int k, int l, int r){

        while(l<=r){
            int mid = (l + r) / 2;
            if (k == a[mid]) return mid + 1;
            else if (k < a[mid]) r=mid-1;
            else l=mid+1;
        }
        return r+1;
    }

}
