package com.lc.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Lc111 {
    public int minDepth(TreeNode root) {
        return traversal(root);
    }
    public int traversal(TreeNode root){
        int depth=0;
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null)
            return 0;
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node=queue.poll();
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
                if(node.left==null&&node.right==null)
                    return depth+1;
            }
            depth++;
        }
        return depth;

    }
}
