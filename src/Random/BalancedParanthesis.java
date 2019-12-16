package Random;

import java.util.*;

public class BalancedParanthesis {
	
	
	public static void main(String[] args) {
		//String str = "()[]{}";
		String str = "([)]";
		boolean isBalnced = isBalancedParanthesis(str);
		System.out.print("isBalnced a balanced Str : " + isBalnced);
	}
	
	public static boolean isBalancedParanthesis(String str) {
		boolean isBalanced = false;
		
		if(str.length() < 2) {
		   isBalanced = true;
		   return isBalanced;
		}
		
		
		Stack<Character> stq = new Stack<>();
		
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
				stq.push(str.charAt(i));
			} else if (!stq.isEmpty() && 
					  (str.charAt(i) == '}' && stq.peek() == '{') || 
					  (str.charAt(i) == ']' && stq.peek() == '[') ||
					  (str.charAt(i) == ')' && stq.peek() == '(')
					  ) {
				stq.pop();
			} else {
				stq.push(str.charAt(i));
			} 
		}
		
		if(stq.isEmpty()) {
			isBalanced = true;
			return isBalanced;
		}
		
		return isBalanced;
	}
	
	
}
