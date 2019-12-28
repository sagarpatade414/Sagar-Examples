package stack;

import java.util.Stack;

public class ValidParanthesis {
	
	public boolean isValid(String s) {
        
        
        Stack<Character> stq = new Stack<>();
        
        char[] charArray = s.toCharArray();
        
        for(char c :charArray){
            if(c == '(' || c == '{' || c == '['){
                stq.push(c);
            } else if (!stq.isEmpty() && ((stq.peek()=='{' && c == '}') 
                                          || (stq.peek()=='(' && c == ')') 
                                          || (stq.peek()=='[' && c == ']') ) ){
                stq.pop();
            } else {
               stq.push(c); 
            } 
        }        
        
        if(stq.isEmpty()){
            return true;
        }               
                       
        return false;
    }
}
