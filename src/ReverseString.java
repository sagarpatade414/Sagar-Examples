public class ReverseString {
	
	public static void main(String[] args) {
		
		String str = "Hello World!";
		String reverseString = reverseString(str);
		System.out.println(reverseString);
		System.out.println(reverseStringChar(str));
	}
	
	//Efficient Solution
	public static String reverseString(String inputString) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=inputString.length()-1; i>=0; i--) {
			sb.append(inputString.charAt(i));
		}
		
		return sb.toString();
	}
	
	//Not Efficient
	public static String reverseStringChar(String inputString) {
		String outputSring = "";
		char[] charArray = inputString.toCharArray();
		
		for(int i=charArray.length-1; i>=0; i--) {
			outputSring += charArray[i];
		}
		
		return outputSring;
	}
	
}
