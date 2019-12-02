import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15, 8 , 9, 7};
		int target = 15;
		int[] twoSumData = twoSum(nums, target);
		System.out.print(twoSumData[0] + " " + twoSumData[1]);
	}
	
	public static int[] twoSum(int[] nums, int target) {
	        
			Map<Integer, Integer> hmap = new HashMap<>();
			
			for(int i=0; i<nums.length;i++) {
			
				int delta = target - nums[i];
				
				if(hmap.containsKey(delta)) {
					return new int[] {hmap.get(delta), i};
				}
				hmap.put(nums[i], i);
			}
			
	        return new int[] {-1, -1};
	 }

	
	
	
}
