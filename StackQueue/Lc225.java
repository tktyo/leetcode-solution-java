package com.lc.StackQueue;

import java.util.LinkedList;
import java.util.Queue;

//implement Stack using Queues
public class Lc225 {
    int size;
    Queue<Integer> queue;
    public Lc225() {
        this.size=0;
        this.queue=new LinkedList<>();
    }

    public void push(int x) {
        this.queue.add(x);
        this.size++;
    }

    public int pop() {
        int tmp=0;
        while(tmp!=size-1){
            this.queue.add(this.queue.poll());
            tmp++;
        }
        int result=this.queue.peek();
        this.queue.poll();
        this.size--;
        return result;
    }

    public int top() {
        int tmp=0;
        while(tmp!=size-1){
            this.queue.add(this.queue.poll());
            tmp++;
        }
        int result=this.queue.peek();
        this.queue.add(this.queue.poll());
        return result;
    }

    public boolean empty() {
        if(this.size==0)
            return true;
        else
            return false;
    }
}
