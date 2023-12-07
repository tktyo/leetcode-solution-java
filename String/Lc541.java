package com.lc.String;


import java.util.Arrays;

//Reverse String 2
public class Lc541 {
    public String reverseStr(String s, int k) {
        char[] result=s.toCharArray();

        for(int i=0;i<s.length();i+=2*k){
            //reverse
            if(i+k-1<s.length()){
                //reverse i,i+k-1
                reverse(i,i+k-1,result);
            }
            else{
                //reverse i,s.length-1
                reverse(i,result.length-1,result);
            }
        }
        return new String(result);
    }
    public static void reverse(int i,int j,char[] s){
        int left=i;
        int right=j;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }
}
