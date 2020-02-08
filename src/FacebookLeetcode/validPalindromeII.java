package FacebookLeetcode;

public class validPalindromeII {
	
	public static boolean validPalindrome(String s) {
	       
        if(s.length() == 1){
            return true;
        }
        
       int left=0;
       int right=s.length()-1;
        
       while(left<=right){
           if(s.charAt(left) == s.charAt(right)){
               left++;
               right--;
           } else {
              return (isPlaindrome(s, left+1, right) || isPlaindrome(s, left, right-1)); 
           }
           
       } 
        
       return true; 
        
    }
	
	public static Boolean isPlaindrome(String str, int left, int right){
        
        while(left<=right){
           if(str.charAt(left) == str.charAt(right)){
              left++;
               right--;
           } else {
               return false;
           }
            
        }
        
        
        return true;
    }
	
	public static void main(String[] main){

    	String order = "abca"; 
    	Boolean isValidPalindrome = validPalindrome(order);
    	System.out.println("num To Word : " + isValidPalindrome);
    }
	
}
