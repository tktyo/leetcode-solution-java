package com.lc.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Lc144_2 {
    // preorder traversal solution 2: non-recursive
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null)
            return result;
        Stack<TreeNode> support=new Stack<>();
        support.push(root);
        while(!support.isEmpty()){
            TreeNode tmp=support.pop();
            result.add(tmp.val);
            if(tmp.right!=null)
                support.push(tmp.right);
            if(tmp.left!=null)
                support.push(tmp.left);
        }
        return result;
    }
}
