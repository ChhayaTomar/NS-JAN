package com.company.assignments.hashing;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        int index=firstNonRepeatingInteger(str);
        System.out.println(index);
    }

    private static int firstNonRepeatingInteger(String str) {
        HashMap<Character, Integer> hmap=new HashMap<>();
        int index=-1;

        for(int i=0;i<str.length();i++){
            Character ch=str.charAt(i);
            if(hmap.containsKey(ch)){
                hmap.put(ch,hmap.get(ch)+1);
            }else{
                hmap.put(ch,1);
            }
        }
        for(int i=0;i<str.length();i++){
            Character ch=str.charAt(i);
            if(hmap.get(ch) == 1){
                index=str.indexOf(ch);
                break;
            }
        }

        return index;
    }
}

