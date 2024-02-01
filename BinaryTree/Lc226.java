package com.lc.BinaryTree;

public class Lc226 {
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }
    public void invert(TreeNode root){
        if(root==null)
            return;

        TreeNode tmp=root.right;
        root.right=root.left;
        root.left=tmp;
        invert(root.left);
        invert(root.right);
    }
}
