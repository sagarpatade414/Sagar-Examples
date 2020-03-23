package Walmart;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class GenerateParenthesis {
	
	public static List<String> generateParenthesis(int n) {
	       List<String> result = new ArrayList<>();
	       helper(result, "", n, n);
	       return result;
	}
	    
	private static void helper(List<String> result, String curr, int left, int right){
	        
	        if(left<0 || left>right){
	            return;
	        }
	        
	        if(left==0 && right==0){
	            result.add(curr);
	            return;
	        }
	        
	        helper(result, curr + "(", left-1, right);
	        helper(result, curr + ")", left, right-1);
	}
	    
	
	public static void main(String[] args) {
		
		Queue<Integer> que = new LinkedList<>(); 
		
		int n=3;
		            		   
		List<String> generateParenthesis = generateParenthesis(n);
		System.out.println(generateParenthesis.toString());
	}
}
