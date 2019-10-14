import java.util.HashMap;
import java.util.Map;

public class ContainsNearbyDuplicate {
	
	public static void main(String[] args) {
		
		//int[] nums = {1,2,3,1}; 
		//int k = 3;
		
		int[] nums = {1,2,3,1,2,3}; 
		int k = 2;
		
		boolean contains = containsNearbyDuplicate(nums, k);
		System.out.print("contains Near by Duplicate : " + contains);
	}
	
	
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
        
		Map<Integer, Integer> hmap = new HashMap<>();
		
		
		for(int i=0; i<nums.length; i++) {
			
			int current = nums[i];
			
			if( hmap.containsKey(current) && i - hmap.get(current) <= k ) {
				return true;
			} else {
				hmap.put(current, i);
			}
			
		}
		
		return false;
    }
}
