import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
	
	
	public static void main(String[] args) {
		
		int firstUniqueCHarIndex = firstUniqChar("lvoveleetcode");
		
		System.out.println("firstUniqueCHarIndex : " + firstUniqueCHarIndex);
	}
	
	public static int firstUniqChar(String s) {
        
		Map<Character, Integer> lmap = new LinkedHashMap<>();  
		
		if(s.length() < 1) {
			return -1;
		}
		
		for(int i=0; i<s.length(); i++ ) {
			char c = s.charAt(i);
			
			if(!lmap.containsKey(c)) {
				lmap.put(c, i);
			} else {
				lmap.put(c, -1);
			}
		}
		
		
		
		for(char CKey : lmap.keySet()) {
			
			if(lmap.get(CKey) > -1) {
				return lmap.get(CKey);
			}
			
		}
		
		
		return -1;
    }

}
