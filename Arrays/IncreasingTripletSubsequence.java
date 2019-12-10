
public class IncreasingTripletSubsequence {
	
	public static void main(String[] args) {
		//int[] nums = {1,2, 3, 4, 5, 6};
		//int[] nums = {5,4,3,2,1};
		int[] nums= {7, 9, 10, 19, 21};
		
		boolean isIncreasingTripletSubsequence = checkIsIncreasingTripletSubsequence(nums);
		
		System.out.println("isIncreasingTripletSubsequence : " + isIncreasingTripletSubsequence );
	}
	
	public static boolean checkIsIncreasingTripletSubsequence(int[] nums) {
		
		if(nums.length<3) {
			return false;
		}
		
		int minOne=Integer.MAX_VALUE;
		int minTwo=Integer.MAX_VALUE;
		
		for(int num : nums) {
			
			if(num < minOne) {
				minOne = num;
			} 
			
		    if (num > minOne) {
				minTwo = Math.min(num, minTwo);
			} 
			
			if (num > minTwo) {
				return true;
			} 
		}
		
		
		return false;
	}
}
