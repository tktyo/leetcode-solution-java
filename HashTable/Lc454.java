package com.lc.HashTable;

import java.util.HashMap;

// 4sum
public class Lc454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int result=0;
        HashMap<Integer,Integer> table=new HashMap<>();
        //calculate the sum of nums1 and nums2
        for(int i:nums1){
            for(int j:nums2){
                int sum1=i+j;
                table.put(sum1,table.getOrDefault(sum1,0)+1);
            }
        }
        for(int i:nums3){
            for(int j:nums4){
                int sum2=i+j;
                if(table.containsKey(-sum2)){
                    result+=table.get(-sum2);
                }
            }
        }
        return result;
    }
}
