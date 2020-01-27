package facebook;

import java.util.HashSet;
import java.util.Set;

public class CommonSubString12 {
	
	// Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {

        if( s1.length() <= 0 || s2.length() <= 0) {
            return "NO";
        }

        Set<Character> s1Ch = new HashSet<>();
        Set<Character> s2Ch = new HashSet<>();
        

        for(char c :s1.toCharArray()){
            s1Ch.add(c);
        } 

        for(char c :s2.toCharArray()){
            s2Ch.add(c);
        }

        s1Ch.retainAll(s2Ch);

        if(!s1Ch.isEmpty()){
            return "YES";
        } else { 
            return "NO";
        }
        
    }
    
}
