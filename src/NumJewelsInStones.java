import java.util.HashSet;
import java.util.Set;

public class NumJewelsInStones {
	
	public static void main(String[] args) {
		
		String J = "aA", S = "aAAbbbb";
		int jewlsCount = numJewelsInStones(J, S);
		
		System.out.println("jewls Count : " + jewlsCount);
		
	}
	
	public static int numJewelsInStones(String J, String S) {
		
		S.toLowerCase();
        
		if(J == null || J.length() == 0 || S == null || S.length() == 0) {
			return 0;
		}
		
		int count=0;
		Set<Character> jewls= new HashSet<>();
		
		for(Character j :J.toCharArray()) {
			jewls.add(j);
		}
		
		
		for(int i=0; i<S.length(); i++) {
			if(jewls.contains(S.charAt(i))) {
				count++;
			}
		}
		
		
		return count;
		
		
    }
	
}
