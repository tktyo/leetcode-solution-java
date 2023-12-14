package com.lc.StackQueue;

import java.util.Arrays;
import java.util.Stack;

//remove all adjacent duplicates in string
public class Lc1047 {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(!stack.isEmpty()&&stack.peek()==s.charAt(i)){
                stack.pop();
            }
            else
                stack.push(s.charAt(i));
        }
        char[] result=new char[stack.size()];
        for (int i = result.length-1; i >=0 ; i--) {
            result[i]=stack.pop();
        }
        return new String(result);
    }
}
