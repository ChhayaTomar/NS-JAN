package com.company.mockDSA2.easy;

//Check if the string is palindrome or not

public class Ques1 {
    public static void main(String[] args) {
        String str = "chhaya";
        int n = str.length() - 1;
        int i = 0;
        while (i < n) {
            if (str.charAt(i) != str.charAt(n)) {
                System.out.println("not palindrome");
                return;
            }

            i++;
            n--;

        }
        System.out.println("is palindrome");
    }
}
