package Random;

public class findMissingElement {
		
	public static void main(String[] args) {
		int[] nums = {3, 1, 5, 4, 6, 8, 7, 9};
		int missingNumber = findMissingNo(nums, 9);
		System.out.println("missingNumber : : " + missingNumber);
	}
	
	public static int findMissingNo(int[] nums, int no) {
		int result=-1;
		int sum = 0;
		int total= (no * (no + 1))/2;
		
		System.out.println("total : : " + total);
		
		if(nums==null || nums.length < 0) {
			return result;
		}
		
		for(int num :nums) {
			sum += num;
		}
		
		result = total - sum;
		return result;
	}
	
}
