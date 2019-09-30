import java.util.HashSet;
import java.util.Set;



public class ReverseVowels {
	
	public static void main(String[] args) {
		String reverseStr = reverseVowels("aeiouAEIOU");
		
		System.out.println("Reverse Vowel String : " + reverseStr);
	}
	
	
	public static String reverseVowels(String s) {
        
		int i=0;
		int j=s.length()-1;
		
		Set<Character> vowels = new HashSet<>();
		vowels.add('A');
		vowels.add('a');
		vowels.add('E');
		vowels.add('e');
		vowels.add('I');
		vowels.add('i');
		vowels.add('O');
		vowels.add('o');
		vowels.add('U');
		vowels.add('u');
		
		char[] stringChar = s.toCharArray(); 
	
		while(i<j) {
			
			if( i<j  && !vowels.contains(stringChar[i]) ) {
				i++;
			}
			
			if( i<j  && !vowels.contains(stringChar[j]) ) {
				j--;
			}
			
			char temp = stringChar[i];
			stringChar[i++] = stringChar[j];
			stringChar[j--] = temp;
		}
		
		return new String(stringChar);
    }
	
}
