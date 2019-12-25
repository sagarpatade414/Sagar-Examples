package Random;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UniqueCharInString {
	
	public static void main(String[] args) {
		String str = "loveleetcode";
		int indexValue = uniqueCharInAString(str);
		System.out.println("indexValue : " + indexValue);
	}
	
	public static int uniqueCharInAString(String str) {
		if(str != null && str.length() <= 0) {
			return -1;
		}
		
		Map<Character, Integer> hmap = new LinkedHashMap<>();
		
		for(int i=0; i<str.length(); i++) {
			char current = str.charAt(i);
			if(!hmap.containsKey(current)) {
				hmap.put(current, i);
			} else {
				hmap.put(current, -1);
			}
		}
		
		
		Set<Entry<Character, Integer>> mapSet = hmap.entrySet();
	
		for(Entry<Character, Integer> validSet :mapSet) {
			if(validSet.getValue() != -1) {
				return validSet.getValue();
			}
		}
		
		
		return -1;
	}
}
