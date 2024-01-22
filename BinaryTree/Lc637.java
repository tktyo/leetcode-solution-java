package com.lc.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Lc637 {
    public List<Double> result=new ArrayList<>();
    public List<Double> averageOfLevels(TreeNode root) {
        levelOrderTraversal(root);
        return result;
    }
    public void levelOrderTraversal(TreeNode root) {
        if (root == null)
            return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            double sum=0.0;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum+= node.val;
                //list.add(node.val);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            result.add(sum/size);
        }
    }

}
