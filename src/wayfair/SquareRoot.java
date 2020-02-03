package wayfair;

public class SquareRoot {
	
	public static int mySqrt(int x) {
	        
	        long left=0;
	        long right=x;
	        
	        while(left+1<right){
	            long mid = left + (right-left)/2;
	            
	            if(mid * mid == x) {
	                return (int)mid;
	            } else if (mid * mid < x) {
	                left=mid; 
	            } else {
	                right=mid;
	            }
	        }
	        
	        if(right*right == x){
	            return (int)right;
	        }
	        
	        return (int)left;
	 }
	
	public static void main(String[] args) {
		int n =1024;
		int res =mySqrt(n);
		System.out.print(res);
				
	} 
}
