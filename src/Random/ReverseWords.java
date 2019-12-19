package Random;

public class ReverseWords {
	
	public static void main(String[] args) {
	    String str1 = "Java Programming ";
	   
	    String reversedWord = reverseWords(str1);
	    System.out.println(reversedWord);
	    
	}
	
	public static String reverseWords(String str) {
		StringBuilder reversedString = new StringBuilder();
		
		if(str.length() < 1) {
			return reversedString.toString();
		}
		
		String[] wordsArr = str.split(" ");
		
		for(int i=0; i<wordsArr.length; i++) {
			String words = wordsArr[i];
			StringBuilder reversedWord = new StringBuilder();
			
			for(int j=words.length()-1; j>=0; j--) {
				reversedWord.append(words.charAt(j));
			}
			reversedString.append(reversedWord).append(" ");
		}
		
		return reversedString.toString();
	}
	
	
}
