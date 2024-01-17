package com.lc.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Lc94_2 {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack=new Stack<>();
        List<Integer> result=new ArrayList<>();
        if(root==null)
            return result;
        TreeNode cur=root;
        while(cur!=null||!stack.isEmpty()){
            if(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            else{
                cur=stack.pop();
                result.add(cur.val);
                cur=cur.right;
            }
        }
        return result;
    }
}
