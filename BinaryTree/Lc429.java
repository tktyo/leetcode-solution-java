package com.lc.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Lc429 {
    public List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> levelOrder(Node root) {
        levelOrderTraversal(root);
        return result;
    }
    public void levelOrderTraversal(Node root) {
        if (root == null)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> item=new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                item.add(node.val);
                for (int j = 0; j < node.children.size(); j++) {
                    queue.add(node.children.get(j));
                }
            }
            result.add(item);
        }
    }
}
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};