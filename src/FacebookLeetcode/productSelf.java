package FacebookLeetcode;

public class productSelf {
	
	public static void main(String[] args) {
		 int[] nums = {2,3,4,5};
		 int[] check = productExceptSelf(nums);
		 
		 for(int c:check) {
			 System.out.println("check c: " + c );
		 }
	 }
	
	public static int[] productExceptSelf(int[] nums) {
		int N = nums.length;
		
		int[] outputProduct = new int[N];
		
		outputProduct[0]=1;
		
		for(int i=1; i<N; i++){
			outputProduct[i] = nums[i-1] * outputProduct[i-1];
		}		
		
		int R=1;
		
		for(int i=N-1; i>=0; i--){
			outputProduct[i] = outputProduct[i] * R;
			R *= nums[i];
		}
		
		return outputProduct;
	}
}
