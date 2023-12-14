package com.lc.StackQueue;

import java.util.Stack;

//Implement Queue using Stacks
public class Lc232 {
    int size;
    Stack<Integer> inStack= new Stack<>();
    Stack<Integer> outStack=new Stack<>();
    public Lc232() {
        this.size=inStack.size()+outStack.size();
    }

    public void push(int x) {
        inStack.push(x);
        this.size++;
    }

    public int pop() {
        if(outStack.empty()){
            while(!inStack.isEmpty()){
                outStack.push(inStack.pop());
            }
        }
        this.size--;
        return outStack.pop();
    }

    public int peek() {
        if(outStack.isEmpty()){
            while(!inStack.isEmpty()){
                outStack.push(inStack.pop());
            }
        }
        return outStack.peek();
    }

    public boolean empty() {
        if(size==0)
            return true;
        else
            return false;
    }
}
