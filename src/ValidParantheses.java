import java.util.Stack;

public class ValidParantheses {

	public static void main(String[] args) {
		// String inputString = "()";
		//String inputString = "()[]{}";
		String inputString = "(]";
		System.out.println("isValid " + isValid(inputString));
	}
	
	
	public static boolean isValid(String s) {
        
		Stack<Character> stack = new Stack<>();
		
		for(char c: s.toCharArray()) {
			
			if(c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			} else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			} else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else {
				return false;
			}
		}
		
		return stack.isEmpty();
    }
}
