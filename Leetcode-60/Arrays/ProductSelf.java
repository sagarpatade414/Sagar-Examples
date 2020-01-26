package Arrays;

public class ProductSelf {
	
	public static int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        
        int[] leftProduct = new int[N];
        int[] rightProduct = new int[N];
        int[] outPutProduct = new int[N];
        
        if(nums.length == 0){
            return outPutProduct;
        }
        
        leftProduct[0]=1;
        rightProduct[N-1]=1;
        
        for(int i=1; i<N; i++){
            leftProduct[i] = nums[i-1] * leftProduct[i-1];
        }
         
        for(int i=N-2; i>=0; i--){
            rightProduct[i] = nums[i+1] * rightProduct[i+1];
        }
        
        for(int i=0; i<N; i++){
            outPutProduct[i] = leftProduct[i] * rightProduct[i];
        }
        
        return outPutProduct;
    }
	
	public static void main(String[] args) {
		 int[] nums = {1,2,3,4};
		 int[] check = productExceptSelf(nums);
		 System.out.println("check : " + check );
		 
		 for(int c:check) {
			 System.out.println("check c: " + c );
		 }
	 }
}
