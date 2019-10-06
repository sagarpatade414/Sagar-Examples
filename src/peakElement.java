
public class peakElement {

   public static void main(String[] args) {
	   //int[] nums = {1,2,3,1};
	   int[] nums = {1,2,1,3,5,6,4};
	   
	   int peakIndex = findPeakElement(nums);
	   System.out.println("peakIndex : " + peakIndex);
	  
   }	
	
   public static int findPeakElement(int[] nums) {
      int peakIndex=0;
	  int peakValue= Integer.MIN_VALUE; 
	  
	  
	  for(int i=0; i<nums.length; i++) {
		  
		  if(nums[i] > peakValue) {
			  peakValue = nums[i];
			  peakIndex=i;
		  }
		  
	  }
	  
	  return peakIndex;
    
   }
	
}
