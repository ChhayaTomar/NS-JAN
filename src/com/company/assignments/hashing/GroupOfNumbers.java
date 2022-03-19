package com.company.assignments.hashing;

import java.util.*;

public class GroupOfNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        HashMap<Integer, Integer> hmap=new HashMap<>();

        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
            if(hmap.containsKey(arr[i])){
                hmap.put(arr[i],hmap.get(arr[i])+1);
            }else{
                hmap.put(arr[i],1);
            }
        }

        LinkedHashMap<Integer, Integer> reverseSortedMapVal = new LinkedHashMap<>();

        ///sorting by value

        hmap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSortedMapVal.put(x.getKey(), x.getValue()));

        LinkedHashMap<Integer, Integer> againSortedKeys = new LinkedHashMap<>();

        ///sorting by value

//        reverseSortedMapVal.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
//                .forEachOrdered(x -> againSortedKeys.put(x.getKey(), x.getValue()));

        System.out.println(reverseSortedMapVal);
//        System.out.println(againSortedKeys.keySet());

//        againSortedKeys.forEach((key, value)->{
//            System.out.print(key + " ");
//        });
        reverseSortedMapVal.forEach((key, value)->{
            System.out.println();
        });

    }
}

