import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SingleNumber {

	public static void main(String[] args) {
		//int[] nums = {2,2,1};
		int[] nums ={4,1,2,1,2};
		singleNumber(nums);
	}
	
	public static int singleNumber(int[] nums) {
	    int singleNumber = 0;
		
		Map<Integer, Integer> hmap = new HashMap<>(); 
		
		for(int i=0; i<nums.length; i++) {
			
			System.out.println(nums[i]);
			
			if(hmap.containsKey(nums[i])) {
				System.out.println("hmap.get(i) : " + hmap.get(nums[i]) );
				hmap.remove(nums[i]);
				//hmap.put(nums[i], hmap.get(nums[i]) +1 );
				System.out.println("hmap.get(i) 2 : " + hmap.get(nums[i]));
			} else {
				 hmap.put(nums[i], 1);
			}	
		}
		
		for( Integer k : hmap.keySet()) {
			System.out.println("singleNumber : " + singleNumber);
			singleNumber = k;
		}
		
		
	   return singleNumber;
	}
}
