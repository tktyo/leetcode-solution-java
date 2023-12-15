package com.lc.StackQueue;

import java.util.Objects;
import java.util.Stack;

//evaluate reverse polish notation
public class Lc150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> resultStack=new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if(tokens[i].equals("+")){
                int y=resultStack.pop();
                int x=resultStack.pop();
                resultStack.push(x+y);
            }
            else if(tokens[i].equals("-")){
                int y=resultStack.pop();
                int x=resultStack.pop();
                resultStack.push(x-y);
            }
            else if(tokens[i].equals("*")){
                int y=resultStack.pop();
                int x=resultStack.pop();
                resultStack.push(x*y);
            }
            else if (tokens[i].equals("/")){
                int y=resultStack.pop();
                int x=resultStack.pop();
                resultStack.push(x/y);
            }
            else {
                resultStack.push(Integer.parseInt(tokens[i]));
            }

        }
        return resultStack.pop();
    }
}
