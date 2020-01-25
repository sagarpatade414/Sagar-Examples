package Arrays;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
	
	 public static boolean containsDuplicate(int[] nums) {
	        
	        if(nums.length == 0){
	            return false;
	        }
	        
	        Map<Integer, Integer> hmap = new HashMap<>();
	        
	        for(int i=0; i<nums.length; i++) {
	            if(hmap.containsKey(nums[i])){
	                hmap.put(nums[i], hmap.get(nums[i])+1);
	            }else{
	                hmap.put(nums[i], 1);
	            }
	        }
	        
	        for(Map.Entry<Integer,Integer> entry : hmap.entrySet()){
	            if(entry.getValue() > 1){
	                return true;
	            }
	        }
	        
	        return false;
	   }
	 
	 public static void main(String[] args) {
		 int[] nums = {1,2,3,4};
		 boolean check = containsDuplicate(nums);
		 System.out.println("check : " + check );
	 }
	 
}
