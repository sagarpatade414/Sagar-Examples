package Random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetII {
	
	public static void main(String[] args) {
		int[] nums = {1,2,2,3};
		subsets(nums);
	}
	
	public static List<List<Integer>> subsets(int[] nums){
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		generateSubSet(list, new ArrayList<>(), nums, 0);
		return list;
	}
	
	
	public static void generateSubSet(List<List<Integer>> list, List<Integer> currentList, int[] nums, int start){
		list.add(new ArrayList<>(currentList));
		System.out.println("list : " + list);
		
		for(int i=start; i<nums.length; i++) {
			//For duplicate check;
			if( (i > start) && (nums[i] == nums[i-1])) {
				continue;
			}
			currentList.add(nums[i]);
			generateSubSet(list, currentList, nums, i+1);
			currentList.remove(currentList.size() - 1);
		}
	}
	
}
