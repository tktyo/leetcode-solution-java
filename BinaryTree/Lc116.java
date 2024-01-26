package com.lc.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Lc116 {
    public Node connect(Node root) {
        population(root);
        return root;
    }
    public void population(Node root){
        if(root==null)
            return;
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        root.next=null;
        while(!queue.isEmpty()){
            int size=queue.size();
            Node next=null;
            for (int i = 0; i < size; i++) {
                Node node=queue.poll();
                if(node.right!=null){
                    queue.add(node.right);
                    node.right.next=next;
                    next=node.right;
                }
                if(node.left!=null){
                    queue.add(node.left);
                    node.left.next=next;
                    next=node.left;
                }
            }
        }

    }
}
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};