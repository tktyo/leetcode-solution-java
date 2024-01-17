package com.lc.BinaryTree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class Lc144 {

    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result=new ArrayList<>();
        preorder(root,result);
        return result;
    }
    public static void preorder(TreeNode root,ArrayList<Integer> result){
        if(root==null)
            return;
        result.add(root.val);
        preorder(root.left,result);
        preorder(root.right,result);
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){this.val=val;}
    TreeNode(int val, TreeNode left,TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}
