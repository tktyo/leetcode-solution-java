package com.lc.HashTable;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
// 4 sum
public class Lc18 {

    public static void main(String[] args){
        int[] nums=new int[]{2,2,2,2,2};
        fourSum(nums,8);
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result= new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length<4)
            return result;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>target&&nums[i]>=0)
                continue;
            if(i>0&&nums[i-1]==nums[i])
                continue;
            //System.out.println(1);
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]>target&&nums[j]>0)
                    break;
                //System.out.println(2);
                if(j>i+1&&nums[j-1]==nums[j])
                    continue;
                int left=j+1;
                int right=nums.length-1;

                while(left<right){
                    //System.out.println(3);
                    long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;
                        while(left<right&&nums[left]==nums[left-1])
                            left++;
                        while(left<right&&nums[right]==nums[right+1])
                            right--;
                    }
                    else if(sum>target){
                        right--;
                    }
                    else{
                        left++;
                    }
                }
            }
        }
        return result;
    }
}
