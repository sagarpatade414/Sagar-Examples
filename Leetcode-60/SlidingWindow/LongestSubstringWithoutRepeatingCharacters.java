package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
	
	public static void main(String[] args) {
		 String s= "abcabcdbb";
		 int stringLen = lengthOfLongestSubstring(s);
		 System.out.println("stringLen : " + stringLen);
	}
	
	public static int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0; 
        int max=0;
        
        Set<Character> hset = new HashSet<>();
        
        while(j<s.length()){
            System.out.println("charAt(j) :" +s.charAt(j));
        	System.out.println(hset);
            if(!hset.contains(s.charAt(j))){
                hset.add(s.charAt(j++));
                max = Math.max(max, hset.size());
            } else {
               hset.remove(s.charAt(i++)); 
            }
        }
        
        return max;
    }
}
