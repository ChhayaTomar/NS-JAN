package com.company.practice.tree;

public class SumOfNodes {
    public static int sum(BinaryTreeImplementation.TreeNode root){
        if(root==null) return 0;
        int leftSum=sum(root.left);
        int rightSum=sum(root.right);
        return leftSum +  rightSum + root.data;
    }
}
