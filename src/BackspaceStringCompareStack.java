import java.util.Stack;

public class BackspaceStringCompareStack {
	
	public static void main(String[] args) {
		
		//String S = "a#c";
		//String T = "b";
				
		String S = "a##c";
		String T = "#a#c";
				
		//String S = "ab#c";
		//String T = "ad#c";
		
		//String S = "ab##";
		//String T = "c#d#";
		
		Boolean isStringEqual = backspaceCompare(S,T);
		System.out.println("isStringEqual : " + isStringEqual);
	}
	
	public static boolean backspaceCompare(String S, String T) {
	
		Stack<Character> sStack = new Stack<>();
		Stack<Character> tStack = new Stack<>();

		
		for(char sChar : S.toCharArray()) {
			if(sChar != '#') {
				sStack.push(sChar);
			} else if (!sStack.isEmpty()) {
				sStack.pop();
			}
		}
		
		for(char tChar : T.toCharArray()) {
			if(tChar != '#') {
				tStack.push(tChar);
			} else if (!tStack.isEmpty()) {
				tStack.pop();
			}
		}
		
		
		while(!sStack.isEmpty()) {
			
			Character sElem = sStack.pop();
			
			if(tStack.isEmpty() || tStack.pop() != sElem) {
				return false;
			}
			
		}
		
		return sStack.isEmpty() && tStack.isEmpty();
		
	}	
}
