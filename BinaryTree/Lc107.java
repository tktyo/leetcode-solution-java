package com.lc.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Lc107 {
    List<List<Integer>> result= new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        levelOrderTraversal(root);
        return result.reversed();
    }
    public void levelOrderTraversal(TreeNode root) {
        if (root == null)
            return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            result.add(list);
        }
    }
}
