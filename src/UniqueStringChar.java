import java.util.HashMap;
import java.util.Map;

public class UniqueStringChar {
	
	public static void main(String[] args) {
		
		//String Str = "Sagar";
		String Str = "Smita";
		boolean check = UniqueStringChars(Str);
		System.out.println("String contains unique characters,  " + check);
		
	}
	
	
	private static boolean UniqueStringChars(String str) {
		
		Map<Character, Integer> hmap = new HashMap<>();
		char[] charArray = str.toCharArray();
		
		
		for(int i=0; i<charArray.length; i++) {
			
			if(hmap.containsKey(charArray[i])) {
				return false;
			}
			
			hmap.put(charArray[i], i);
			
		}
		
		
		return true;
	}

}
