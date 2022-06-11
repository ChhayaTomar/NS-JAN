package com.company.practice.tree;

public class HeightOfTheTree {
    public static int height(BinaryTreeImplementation.TreeNode root){
        if(root==null) return 0;
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        return (Math.max(leftHeight,rightHeight) +1);
    }
}
