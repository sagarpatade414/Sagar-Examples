package FacebookLeetcode;

public class minWindowSubString {
	
	 public String minWindow(String s, String t) {
	       
	        if(s.length() == 0 || t.length() == 0 || s.length()<t.length()){
	            return "";
	        }
	        
	        int[] map = new int[128];
	        for(char c:t.toCharArray()){
	            map[c]++;
	        }
	        
	        int start=0;
	        int end=0;
	        int startMin=0;
	        int minLen=Integer.MAX_VALUE;
	        int counter = t.length();
	        
	        
	        while(end<s.length()){
	            final char c1 = s.charAt(end);
	            
	            if(map[c1] > 0){
	               counter--; 
	            }
	            
	            map[c1]--;
	            end++;
	            
	            while(counter == 0){
	               if(minLen > end - start){
	                   minLen = end-start;
	                   startMin = start;
	               }
	                
	                final char c2 = s.charAt(start); 
	                map[c2]++;
	                if(map[c2] > 0){
	                    counter++; 
	                }
	                start++;
	            }
	        }
	        
	        return minLen==Integer.MAX_VALUE? "" : s.substring(startMin, startMin+minLen);
	    }
	
	public static void main(String[] args){
		String S = "DADOBECODEBANC";
		String T = "ABC";
		minWindow(S, T);
	}
	
}	
