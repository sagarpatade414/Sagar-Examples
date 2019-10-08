public class isBadVersion {
	
	public static void main(String[] args) {
		
		firstBadVersion(5);
	}
	
	public static int firstBadVersion(int n) {
        
       int left=1;
       int right=n;
        
       while(left < right) {
    	   
    	   int mid = left + (right - left)/2;
    	   
    	   if(!isBadVersion(mid)) {
    		   left = mid +1;
    	   } else {
    		   right = mid;
    	   }
    	   
       }
       
        return left;
    }
}
