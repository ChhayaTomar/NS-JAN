package com.company.arena.linkedlist;

import java.util.LinkedList;

public class PalindromeList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            Node i = this.head;
            while (i.next != null) {
                i = i.next;
            }
            i.next = newNode;
        }
    }

    public static boolean isPalindrome(Node head) {
        Node s = head;
        Node f = head;
        boolean flag = true;

        if (head == null) {
            flag = false;
            return flag;
        } else {
            while (f.next != null) {
                s = s.next;
                f = f.next.next;
            }
            Node curr = s.next;
            Node next = null;
            Node prev = null;

            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node head2 = prev;
            Node i = head2;

            while (i != null) {
                if (i.data != i.data) {
                    flag = false;
                    s = s.next;
                    i = i.next;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        //PalindromeList ll=new PalindromeList();
        LinkedList<Integer> ll=new LinkedList<>();
//        ll.insertAtLast(1);
//        ll.insertAtLast(2);
//        ll.insertAtLast(3);
//        ll.insertAtLast(2);
//        ll.insertAtLast(1);

        //boolean ans=ll.isPalindrome(ll.head);
        //System.out.println(ans);


    }
}

