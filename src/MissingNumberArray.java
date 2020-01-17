
public class MissingNumberArray {
	
	public static void main(String[] args) {
		int[] nums = {9,6,4,2,3,5,7,0,1};
		int result = missingNumber(nums); 
		System.out.print("Result : " + result);
	}
	public static int missingNumber(int[] nums) {
	    int sum = nums.length;
	    
	    for (int i = 0; i < nums.length; i++) {
	    	System.out.println("sum before : " + sum);
	    	System.out.println("i : " + i);
	    	System.out.println("nums[i] : " + nums[i]);
	    	
	        sum += i - nums[i];
	        System.out.println("sum after : " + sum);
	    }  
	    return sum;
	}
	
}
