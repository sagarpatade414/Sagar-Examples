package Random;

public class Anagram {
	
	public static void main(String[] args) {
	    String str1 = "sagaa";
	    String str2 = "ragas";

	    System.out.println("Hello world!");
	    boolean isAnagramb = isAnagram(str1, str2);

	    System.out.println("Hello world! " + isAnagramb);
	  }
	  
	  public static boolean isAnagram(String str1, String str2){
	     
	    if(str1.length() != str2.length()){
	      return false;
	    }

	    int[] charArr  = new int[256];
	    str1 = str1.toLowerCase();
	    str2 = str2.toLowerCase();

	    for(char c : str1.toCharArray()){
	      System.out.println("c : " + c);
	      System.out.println("charArr[c] : " + charArr[c]);
	      charArr[c]++;
	    }

	    for(char c : str2.toCharArray()){
	      System.out.println("c : " + c);
	      System.out.println("charArr[c] : " + charArr[c]);
	      charArr[c]--;

	    }

	    for(int i : charArr){
	      if(i != 0){
	        return false;
	      }
	    }
	    
	    return true;
	  }
	

}
