package com.lc.StackQueue;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Objects;
import java.util.PriorityQueue;

//Top k frequent elements
public class Lc347 {
    public int[] topKFrequent(int[] nums, int k) {
        //build element:frequency map
        HashMap<Integer,Integer> frequency=new HashMap<>();
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<int[]> result=new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1], o2[1]);
            }
        });
        for(int key:frequency.keySet()) {
            int[] tmp = new int[2];
            tmp[0] = key;
            tmp[1] = frequency.get(key);
            result.add(tmp);
            if (result.size() > k)
                result.poll();
        }
        int[] res=new int[result.size()];
        for (int i = 0; i < res.length; i++) {
            res[i]=result.poll()[0];
        }
        return res;
    }
        
}
