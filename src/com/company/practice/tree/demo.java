package com.company.practice.tree;


public class demo {
    public void inorderTraversal(){
        /*
        if(leftChild !=null){
         leftChild.inOrderTraversal();
         }

         sout(data)

         if(rightchild!=null){
         righchild.inordertraversal();
         }

         */
    }
    public void preOrderTraversal(){
        /*
        sout(data)
        if(leftChild !=null){
         leftChild.preOrderTraversal();
         }



         if(rightchild!=null){
         righchild.preordertraversal();
         }

         */
    }
    public void postOrdertraversal(){
        /*

        if(leftChild !=null){
         leftChild.postOrderTraversal();
         }

         if(rightchild!=null){
         righchild.postordertraversal();
         }

         sout(data)
         */
    }
    public class Node{
        private int data;
        private Node leftChild;
        private Node rightChild;

        public Node(int data){
            this.data=data;
        }


    }
}
