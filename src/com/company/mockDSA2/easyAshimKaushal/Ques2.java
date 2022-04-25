package com.company.mockDSA2.easyAshimKaushal;

//Insert a new node at Nth position from start

public class Ques2 {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;

    public void insert(int x){
        Node newNode=new Node(x);
        if(head==null){
            head=newNode;
        }else{
            Node curr=head;
            while(curr.next !=null){
                curr=curr.next;
            }
            curr.next=newNode;
        }
    }

    public void insertAtNthPos(int x, int pos){
        Node newNode=new Node(x);
        if(head==null && pos ==0){
            head=newNode;
        }
        int i=1;
        Node curr=head;
        Node prev=null;
        while(i<pos){
            prev=curr;
            curr=curr.next;
            i++;
        }
        prev.next=newNode;
        newNode.next=curr;
    }

    public void display(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data + "->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Ques2 ll=new Ques2();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.display();
        ll.insertAtNthPos(10,2);
        ll.display();
    }

}
