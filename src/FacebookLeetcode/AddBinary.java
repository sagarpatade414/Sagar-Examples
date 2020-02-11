package FacebookLeetcode;

public class AddBinary {
	
	public static String addBinary(String a, String b) {
        
        StringBuilder res = new StringBuilder();
        
        int i=a.length() - 1;
        int j=b.length() - 1;
        int carry=0;
        
        while(i >= 0 || j >= 0){
            int sum=carry;
            
            if(i >= 0){
                sum += a.charAt(i--) - '0'; 
            }
            
            if(j >= 0){
                sum += b.charAt(j--) - '0'; 
            }
            
            res.append(sum%2);
            carry = sum/2;
        }
        
        if(carry>0){
          res.append(carry);  
        }
        
        return res.reverse().toString();
    }
	
	public static void main(String[] main){
    	
		String s1 = "11";
		String s2 = "1";
    	String addBinary = addBinary(s1, s2);
    	
    	System.out.println("addBinary: " + addBinary);
        

    	
	}

	
}
