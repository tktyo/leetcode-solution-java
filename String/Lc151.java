package com.lc.String;
// reverse words in a string
public class Lc151 {
    public String reverseWords(String s) {
        StringBuilder result= new StringBuilder();
        int i=s.length()-1;
        while(i>=0){
            if(s.charAt(i)==' ')
                i--;
            else{
                int end=i;
                while(i>=0&&s.charAt(i)!=' ')
                    i--;
                int start=i+1;
                result.append(' ');
                result.append(s, start, end+1);
            }
        }
        return result.substring(1);
    }
}
