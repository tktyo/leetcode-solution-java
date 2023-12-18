package com.lc.StackQueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Lc239 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result=new int[nums.length-k+1];
       Myqueue myqueue=new Myqueue();
        for (int i = 0; i < k; i++) {
            myqueue.push(nums[i]);

        }
        result[0]=myqueue.peek();
        for (int i = k; i < nums.length; i++) {
            myqueue.pop(nums[i-k]);
            myqueue.push(nums[i]);
            result[i-k+1]=myqueue.peek();
        }
        return result;

    }
}
class Myqueue {
    Deque<Integer> queue;
    Myqueue(){
        queue=new LinkedList<>();
    }
    void push(int x){
        while(!queue.isEmpty()&&queue.getLast()<x)
            queue.pollLast();
        queue.add(x);
    }
    void pop(int x){
        if(!queue.isEmpty()&&queue.peek()==x)
            queue.poll();

    }
    int peek(){
        return queue.peek();
    }
}
