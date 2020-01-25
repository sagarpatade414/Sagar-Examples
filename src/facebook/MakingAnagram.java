package facebook;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MakingAnagram {
	
	// Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        int deleteCount = 0;
       
        if(a.length() == 0 || b.length() == 0){
            return deleteCount;
        }
        
        int[] charA = new int[26];
        int[] charB = new int[26];
        
        
        for(char c: a.toCharArray()) {
        	System.out.println(c - 'a');
        	charA[c - 'a']++;
        }
        
        System.out.println("charA : " + charA);
        
        for(char c: b.toCharArray()) {
        	System.out.println(c - 'a');
        	charB[c - 'a']++;
        }
        
        System.out.println("charB : " + charB.toString());
        
        for(int i=0; i<26; i++) {
        	int diff = Math.abs(charA[i] - charB[i]);
        	deleteCount += diff;
        }
        
        
        System.out.println("deleteCount : " + deleteCount);
        return deleteCount;
      
    }
    
   

    public static void main(String[] args) throws IOException {
        

        //String a = "fcrxzwscanmligyxyvym";

        //String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
    	String a = "smitaa";

        String b = "sagarrr";

        int res = makeAnagram(a, b);

       
    }
    
}
