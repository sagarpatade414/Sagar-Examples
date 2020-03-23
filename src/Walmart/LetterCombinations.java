package Walmart;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
	
	public static final String[] MAPPING = {
            "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    
	public static int count=0;
    public static List<String> letterCombinations(String digits) {
        
        List<String> result = new ArrayList<>();
        
        if(digits == null || digits.length() == 0){
            return result;
        }
        
        helper(digits, 0, "", result);
        return result;
    }
    
    
    private static void helper(String digits, int index, String combinations, List<String> result){
        
        if(index == digits.length()){
        	System.out.println("combinations : " + combinations);
            result.add(combinations);
            return; 
        }
        
        
        
        String letters = MAPPING[digits.charAt(index) - '0'];
        
        for(char letter:letters.toCharArray()){
        	
            helper(digits, index+1, combinations+letter, result);
        }
        
    }
	
	public static void main(String[] args) {
		
		String digits ="23";
		            		   
		List<String> letterCombinations = letterCombinations(digits);
		System.out.println(letterCombinations.toString());
	}	
}
