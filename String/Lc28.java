package com.lc.String;

import java.util.Arrays;

//find the index of the first occurrence in a string
public class Lc28 {
    public static int strStr(String haystack, String needle) {
        int[] pmt=getPMT(needle);
        for(int i=0,j=0;i<haystack.length();i++){
            while(j!=0&&haystack.charAt(i)!=needle.charAt(j)){
                j=pmt[j-1];
            }
            if(haystack.charAt(i)==needle.charAt(j)){
                j++;
            }
            if(j==needle.length())
                return i-j+1;
        }
        return -1;
    }

    public static int[] getPMT(String s){
        int[] pmt=new int[s.length()];
        for(int i=1,j=0;i<s.length();i++){
            while(j!=0&&s.charAt(i)!=s.charAt(j))
                j=pmt[j-1];
            if(s.charAt(i)==s.charAt(j))
                j++;
            pmt[i]=j;
        }
        return pmt;
    }
    public static void main(String[] args){
        String s=new String("ababcabaa");
        int[] pmt=getPMT(s);
        int result=strStr("abababcabaa","ababcabaa");
        System.out.println(result);
    }
}
