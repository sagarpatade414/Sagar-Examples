package facebook;

public class JumpingOnCloud04 {
	
	public static void main(String[] args) {
		int[] c = {0, 0, 0, 1, 0, 0};
		int result = jumpingOnClouds(c);
		
		System.out.println("result : " + result);
	}
	
	
	static int jumpingOnClouds(int[] c) {
        int jumpCount=0;
        
        if(c==null || c.length<=0){
            return jumpCount;
        }

       for(int i=0; i<c.length-1;i++) {
        	
        	System.out.println("i before : " + i);
        	//System.out.println("c.length " + (c.length-2));
            if( (i<c.length-2) && (c[i+2] == 0)) {
                jumpCount++;
                i = i+1;
                System.out.println("i after : " + i);
                
            } else if(c[i+1] == 0) {
                jumpCount++;
                System.out.println("i after : " + i);
            }
	            
        }

        return jumpCount;
	}
}
