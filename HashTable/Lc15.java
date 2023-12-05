package com.lc.HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lc15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
                return result;
            if(i>0&&nums[i]==nums[i-1])
                continue;
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[left]+nums[i]+nums[right];
                if(sum==0){
                    result.add(Arrays.asList(nums[left],nums[i],nums[right]));
                    while(left<right&&nums[left+1]==nums[left]){
                        left++;
                    }
                    while(left<right&&nums[right]==nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }
                else if(sum<0)
                    left++;
                else
                    right--;
            }
        }
        return result;
    }
}
