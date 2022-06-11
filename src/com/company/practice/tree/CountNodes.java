package com.company.practice.tree;

public class CountNodes {
    public static int countTotalNodes(BinaryTreeImplementation.TreeNode root){
        if(root==null) return 0;
        int leftCount=countTotalNodes(root.left);
        int rightCount=countTotalNodes(root.right);
        return leftCount+rightCount+1;
    }
}
