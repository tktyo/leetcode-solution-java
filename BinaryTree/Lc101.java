package com.lc.BinaryTree;

import javax.lang.model.type.PrimitiveType;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Lc101 {

    public boolean isSymmetric(TreeNode root) {
        return compare(root.left,root.right);
    }
    public boolean compare(TreeNode left,TreeNode right){
        if(left==null&&right!=null)
            return false;
        else if(left!=null&&right==null)
            return false;
        else if(left==null&&right==null)
            return true;
        else if(left.val!=right.val)
            return false;

        boolean outside=compare(left.left,right.right);
        boolean inside=compare(left.right,right.left);
        return outside&&inside;
    }

    public boolean compare2(TreeNode left,TreeNode right){
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(left);
        queue.add(right);
        while(!queue.isEmpty()){
            left=queue.poll();
            right=queue.poll();
            if(left==null&&right!=null)
                return false;
            else if(left!=null&&right==null)
                return false;
            else if (left==null&&right==null)
                continue;
            else if(left.val!=right.val)
                return false;
            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
    }
}
