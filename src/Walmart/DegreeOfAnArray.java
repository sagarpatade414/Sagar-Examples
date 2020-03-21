package Walmart;

import java.util.HashMap;
import java.util.Map;

public class DegreeOfAnArray {
	
	public int findShortestSubArray(int[] nums) {
	      
        int minDegree=0;
        int minLength=0;
        
        
        Map<Integer, Integer> numCount = new HashMap<>();
        Map<Integer, Integer> numSeen = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            
            numSeen.putIfAbsent(nums[i], i);
            
            numCount.put(nums[i], numCount.getOrDefault(nums[i],0)+1);
            
            if(numCount.get(nums[i]) > minDegree){
                minDegree = numCount.get(nums[i]);
                minLength = i - numSeen.get(nums[i])+1;
            } else if(numCount.get(nums[i]) == minDegree) {
                minLength = Math.min(minLength, i - numSeen.get(nums[i])+1);
            }
            
        }
        
        return minLength;
    }
}
