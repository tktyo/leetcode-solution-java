package com.lc.HashTable;

import java.util.Arrays;
//Ransom Note
public class Lc383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] table=new int[26];
        Arrays.fill(table, 0);
        for(int i=0;i<magazine.length();i++){
            int t=magazine.charAt(i)-'a';
            table[t]++;
        }
        for(int i=0;i<ransomNote.length();i++){
            int t=ransomNote.charAt(i)-'a';
            if(table[t]<=0)
                return false;
            else
                table[t]--;
        }
        return true;
    }
}
