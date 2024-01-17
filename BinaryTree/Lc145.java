package com.lc.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class Lc145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> result=new ArrayList<>();
        postorder(root,result);
        return result;
    }
    public void postorder(TreeNode root,ArrayList<Integer> result){
        if(root==null)
            return;
        postorder(root.left,result);
        postorder(root.right,result);
        result.add(root.val);
    }
}
