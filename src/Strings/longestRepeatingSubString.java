package Strings;

import java.util.HashSet;
import java.util.Set;

public class longestRepeatingSubString {
	
	public static int lengthOfLongestSubstring(String s) {
		int max=0;
		
		int i=0;
		int j=0; 
		
		Set<Character> charSet = new HashSet<>();
		
		while(j<s.length()){
			
			if(!charSet.contains(s.charAt(j))){
				charSet.add(s.charAt(j++));
				max = Math.max(max, charSet.size());
			} else {
				charSet.remove(s.charAt(i++));
			}
		}
		
		return max;
	}
	
	public static void main(String[] args){
		int lengthOfLongestSubstring = lengthOfLongestSubstring("abcabcbb");
		System.out.println("length Of Longest Substring : " + lengthOfLongestSubstring);
		
		String t = "ABCA";
		
		int[] map = new int[128];
        for(char c:t.toCharArray()){
        	System.out.println("map : " +  map[c]);
            map[c]++;
            System.out.println("map : " +  map[c]);
        }
        
        System.out.println("map : " + map);
	}
}
