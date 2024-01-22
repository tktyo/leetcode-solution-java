package com.lc.BinaryTree;

import java.util.*;

public class Lc515 {
    List<Integer> result=new ArrayList<>();
    public List<Integer> largestValues(TreeNode root) {
        levelOrderTraversal(root);
        return result;
    }
    public void levelOrderTraversal(TreeNode root){
        if(root==null)
            return;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int size=queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node=queue.poll();
                list.add(node.val);
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
            }
            result.add(Collections.max(list));
        }
    }
}
