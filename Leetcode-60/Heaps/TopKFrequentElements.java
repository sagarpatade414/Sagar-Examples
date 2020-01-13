package Heaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
	
public List<Integer> topKFrequent(int[] nums, int k) {
        
        List<Integer>[] bucket = new List[nums.length+1]; 
        Map<Integer, Integer> hmap = new HashMap<>();
        
        for(int i=0; i<nums.length; i++) {
           if(hmap.containsKey(nums[i])){
               hmap.put(nums[i], hmap.get(nums[i])+1);
           }else{
               hmap.put(nums[i], 1);
           }
        }
        
        for(int key: hmap.keySet()){
            int frequency = hmap.get(key);
            if(bucket[frequency] == null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
                     
        List<Integer> result = new ArrayList<>();
                     
        for(int i=bucket.length-1; i>=0 && result.size()<k; i--){
            if (bucket[i] != null) {
			    result.addAll(bucket[i]);
		    }
        }
                     
        return result;
                     
    }
}
