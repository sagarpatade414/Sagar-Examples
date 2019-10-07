import java.util.HashMap;
import java.util.Map;

public class TwoSunNew {
		
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15, 8 , 9, 7};
		int target = 15;
		int[] twoSumData = twoSum(nums, target);
		System.out.print(twoSumData[0] + " " + twoSumData[1]);
	}
	
	
    public static int[] twoSum(int[] nums, int target) {
        
    	int[] result = new int[2];
    	
    	Map<Integer, Integer> hmap = new HashMap<>();
    	
    	for(int i=0; i<nums.length; i++) {
    		
    		int diff = target - nums[i];
    		
    		if(hmap.containsKey(diff)) {
    			result[0] = i;
    			result[1] = hmap.get(diff);
    			return result;
    		}
    		
    		hmap.put(nums[i], i);
    	}
    	
    	
        return result;
    }
	
	
}
