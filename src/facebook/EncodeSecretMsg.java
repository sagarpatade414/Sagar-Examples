package facebook;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EncodeSecretMsg {
	
	static void checkMagazine(String[] magazine, String[] note) {
	        
			
	        int count=0;
	
	        if(magazine.length == 0 || note.length == 0){
	            count++;
	        }
	
	
	        Map<String, Integer> hmap = new HashMap<>();
	
	        for(int i=0; i<magazine.length; i++){
	            if(hmap.containsKey(magazine[i])){
	                hmap.put(magazine[i], hmap.get(magazine[i])+1);
	            } else {
	                hmap.put(magazine[i], 1);
	            }
	        }
	
	
	        for(String n : note){
	            if(hmap.containsKey(n) && hmap.get(n)>0){
	                hmap.put(n, hmap.get(n)-1);
	            } else {
	                count++;
	            } 
	        }
	
	        if(count > 0){
	            System.out.println("No");
	        } else {
	            System.out.println("Yes");
	        }
	    }

	public static void main(String[] args) {
		
	}
}
