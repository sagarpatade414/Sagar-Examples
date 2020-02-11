package FacebookLeetcode;

import java.util.List;

public class SubarraySum {
	
	public static int subarraySum(int[] nums, int k) {
        int count=0;
        int sum=0;
        
        Map<Integer,Integer> hmap = new HashMap<>();
        hmap.put(0,1);
        
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            
            if(hmap.containsKey(sum - k)){
                count += hmap.get(sum - k);
            } 
            
            hmap.put(sum, hmap.getOrDefault(sum, 0) + 1);
        
        }
        return count;
    }
	
	public static void main(String[] main){
    	
		int k=7;
		int[] nums = {3,4,7,2,-3,1,4,2};
    	int subarraySum = subarraySum(nums, k);
    	
    	System.out.println("subarraySum: " + subarraySum);
        

    	
	}
}
