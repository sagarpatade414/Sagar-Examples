package Random;

public class ReverseString {
	
	
	public static void main(String[] args) {
		String str = "This is a data object";
		
		StringBuilder sb = new StringBuilder(str);
		String reversedStr = sb.reverse().toString();
		
		System.out.println(reversedStr);
		
		String reversedString = reversedString(str);
		System.out.println(reversedString);
	}
	
	
	public static String reversedString(String str){
		StringBuilder sb = new StringBuilder();
		
		for(int i = str.length()-1; i>=0; i--) {
			sb.append(str.charAt(i));
		}
		
		return sb.toString();
	}
}
