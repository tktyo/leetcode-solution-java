package com.lc.String;
// Repeated substring pattern
public class Lc459 {
    public boolean repeatedSubstringPattern(String s) {
        int[] pmt=getPMT(s);
        int len=s.length();
        if(len==0)
            return false;
        return (pmt[len - 1]>=len - pmt[len - 1])&&(len % (len - pmt[len - 1]) == 0);
    }
    public static int[] getPMT(String s){
        int[] pmt=new int[s.length()];
        pmt[0]=0;
        int j=0;
        for (int i = 1; i < s.length(); i++) {
            while(j!=0&&s.charAt(i)!=s.charAt(j))
                j=pmt[j-1];

            if(s.charAt(i)==s.charAt(j)){
                j++;
            }
            pmt[i]=j;
        }
        return pmt;
    }
}
