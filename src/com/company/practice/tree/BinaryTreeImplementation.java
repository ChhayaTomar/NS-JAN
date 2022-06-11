package com.company.practice.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeImplementation {

    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    TreeNode root = null;

    public TreeNode insertNode(TreeNode root, int dataToBeInserted) {
        if (root == null) {
            root = new TreeNode(dataToBeInserted);
            return root;
        }
        if (dataToBeInserted < root.data) {
            root.left = insertNode(root.left, dataToBeInserted);
        } else {
            root.right = insertNode(root.right, dataToBeInserted);
        }
        return root;
    }

    public TreeNode searchInTree(TreeNode root, int dataToBeSearched) {
        if (root == null || root.data == dataToBeSearched) return root;

        if (dataToBeSearched < root.data) {
            return searchInTree(root.left, dataToBeSearched);
        } else {
            return searchInTree(root.right, dataToBeSearched);
        }
    }

    public void preOrderTraversal(TreeNode root) {
        if (root == null) return;
        System.out.print(root.data + " -> ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void inOrderTraversal(TreeNode root) {
        if (root == null) return;
        inOrderTraversal(root.left);
        System.out.print(root.data + " -> ");
        inOrderTraversal(root.right);
    }

    public void postOrderTraversal(TreeNode root) {
        if (root == null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " -> ");
    }

    public void levelOrderTraversal(TreeNode root){
        if(root==null) return;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        //queue.add(null);
        while(!queue.isEmpty()){
            TreeNode current = queue.remove();
//            if(current==null){
//                if(queue.isEmpty()){
//                    break;
//                }else {
//                    queue.add(null);
//                }
//            }else{
                System.out.print(current.data + " -> ");
                if(current.left!=null){
                    queue.add(current.left);
                }
                if(current.right!=null){
                    queue.add(current.right);
                }
//            }
        }
    }

    public void insert(int dataToBeInserted) {
        root = insertNode(root, dataToBeInserted);
    }

    public TreeNode search(int dataToBeSearched) {
        return searchInTree(root, dataToBeSearched);
    }

    public static void main(String[] args) {
        BinaryTreeImplementation bst = new BinaryTreeImplementation();
        bst.insert(10);
        bst.insert(4);
        bst.insert(16);
        bst.insert(2);
        bst.insert(7);
        bst.insert(1);
        bst.insert(5);
        bst.insert(8);
        bst.insert(14);
        bst.insert(18);
        bst.insert(25);
        bst.insert(20);

        if (bst.search(18) != null) {
            System.out.println(" 18 -> Element found");
        } else {
            System.out.println(" 18 -> Element not found");
        }

        System.out.print("Pre Order Traversal -: ");
        bst.preOrderTraversal(bst.root);
        System.out.println("null");
        System.out.print("In Order Traversal -: ");
        bst.inOrderTraversal(bst.root);
        System.out.println("null");
        System.out.print("Post Order Traversal -: ");
        bst.postOrderTraversal(bst.root);
        System.out.println("null");
        System.out.print("Level Order Traversal -: ");
        bst.levelOrderTraversal(bst.root);
        System.out.println("null");

        System.out.println("Total number of nodes = " + CountNodes.countTotalNodes(bst.root));
        System.out.println("Sum of nodes values are = " + SumOfNodes.sum(bst.root));
        System.out.println("Height of the tree is = " + HeightOfTheTree.height(bst.root));
    }
}
