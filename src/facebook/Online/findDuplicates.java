package facebook.Online;

import java.util.HashSet;
import java.util.Set;

public class findDuplicates {
	
	public static int findDuplicate(int[] nums) {
        
        if(nums == null || nums.length <= 0){
            return 0;
        }
        
        Set<Integer> hset = new HashSet<>();
        
        for(int i=0; i<nums.length; i++){
            if(hset.contains(nums[i])){
                return nums[i];
            }
            hset.add(nums[i]);
        }
        
        return 0;
    }
	
	public static void main(String[] args) {
		 int[] nums = {1,2,3,4};
		 int check = findDuplicate(nums);
		 System.out.println("check : " + check );
	 }
	
}
