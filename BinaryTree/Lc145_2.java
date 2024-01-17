package com.lc.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Lc145_2 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null)
            return result;
        Stack<TreeNode> support=new Stack<>();
        support.push(root);
        while(!support.isEmpty()){
            TreeNode tmp=support.pop();
            result.add(tmp.val);
            if(tmp.left!=null)
                support.push(tmp.left);
            if(tmp.right!=null)
                support.push(tmp.right);

        }
        return result.reversed();
    }
}
