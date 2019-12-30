package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class InterSectionOfTwoArrays {
	public static void main(String[] args){
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		
		
		int[] results = interSection(nums1, nums2);
		
		for(int res :results) {
			System.out.println("res : " + res);
		}
	}
	
	public static int[] interSection(int[] nums1, int[] nums2) {
		Set<Integer> hset = new HashSet<>();
        
        for(int i : nums1){
            hset.add(i);
        }
        
        Set<Integer> intersection = new HashSet<>();
        
        for(int i: nums2){
            if(hset.contains(i)){
              intersection.add(i);
            }
        }
        
        int[] res = new int[intersection.size()];
        int index=0;
        for(int i :intersection){
            res[index++] = i;
        }
        
        return res;
    }
}
