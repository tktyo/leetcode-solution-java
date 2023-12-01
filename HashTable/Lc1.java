package com.lc.HashTable;
import java.util.HashMap;
//two sum
public class Lc1 {
    public int[] twoSum(int[] nums,int target){
        int[] result=new int[2];
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int j=target-nums[i];
            if(map.containsKey(j)){
                result[0]=i;
                result[1]=map.get(j);
                break;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return result;
    }
}
