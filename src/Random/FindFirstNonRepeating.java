package Random;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FindFirstNonRepeating {
  
	public static void main(String[] args) {
		int[] nums = {9,2,3,2,6,6,9,8};
		int res = findFirstNonRepeatingInt(nums);
		
		
		System.out.println(res);
		
	}
	
	public static int findFirstNonRepeatingInt(int[] nums) {
		int result = -1;
		
		if(nums == null || nums.length == 0) {
			return result;
		}
		
		Map<Integer, Integer> hmap = new LinkedHashMap<>();
		
		for(int i=0; i<nums.length; i++){
			if(hmap.containsKey(nums[i])) {
				hmap.remove(nums[i]);
			} else {
				hmap.put(nums[i], nums[i]);
			} 
		}
		
		Set<Integer> keySet = hmap.keySet();
		
		for(Integer k : keySet) {
			return k;
		}
		
		
		
		
		return result;
	}
}
