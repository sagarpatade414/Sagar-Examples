package Random;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OddNumberTimes {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 2, 3, 1, 3};
		int oddTimes = OddNumberTimes(nums);
		System.out.println("oddTimes : " + oddTimes);
		
	}
	
	public static int OddNumberTimes(int[] nums) {
		int result=-1;
		
		if(nums == null || nums.length < 1) {
			return result;
		}
		
		Map<Integer, Integer> hmap = new HashMap<>();
		
		for(int i=0; i<nums.length; i++) {
			if(hmap.containsKey(nums[i])) {
				hmap.put(nums[i], hmap.get(nums[i]) + 1);
			} else {
				hmap.put(nums[i], 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> numMap : hmap.entrySet()) {
			if(numMap.getValue() % 2 != 0) {
				return numMap.getKey();
			}
		}
		
		
		System.out.println(hmap);
		return result;
		
	}
}
