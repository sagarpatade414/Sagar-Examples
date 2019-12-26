package Random;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
	
	public static void main(String[] args) {
		int[] nums = {4,1,2,1,2};
		int indexValue = singleNumberElement(nums);
		System.out.println("indexValue : " + indexValue);
	}
	
	public static int singleNumberElement(int[] nums) {
		
		Set<Integer> numSet = new HashSet<>();
		
		for(int i=0; i<nums.length; i++){
			if(numSet.contains(nums[i])) {
				numSet.remove(nums[i]);
			} else {
				numSet.add(nums[i]);
			}
		}
		
		for(Integer res: numSet) {
			return res;
		}
		
		return -1;
	}
	
}
