package com.lc.StackQueue;

import java.util.Stack;

//valid parentheses
public class Lc20 {
    public boolean isValid(String s) {
        if(s.length()%2!=0)
            return false;

        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) =='(') {
                stack.push(')');
            }
            else if(s.charAt(i) =='['){
                stack.push(']');
            }
            else if(s.charAt(i) =='{'){
                stack.push('}');
            }
            else{
                if(!stack.isEmpty()&&s.charAt(i)==stack.peek())
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
