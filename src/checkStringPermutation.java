
public class checkStringPermutation {

	public static void main(String[] args) {
		String s= "ggod";
		String t = "ddog";
		boolean check = permutation(s, t);
		
		System.out.println("Given String is permutation : " + check);
	}
	
	private static boolean permutation(String s, String t) {
		
		if(s.length() != t.length()) {
			return false;
		}
		
		
		int[] letters = new int[128];
		
		
		for(char c : s.toCharArray()) {
			System.out.println("letters[c] : " + letters[c]);
			letters[c]++;
			System.out.println("c : " + c);
			
		}
		
		for(int i=0; i<t.length(); i++) {
			int c = (int) t.charAt(i);
			System.out.println("c 2 : " + c);
			letters[c]--;
			System.out.println("letters[c] 2 : " + letters[c]);
			
			
			if(letters[c] < 0) {
				return false;
			}
		}
		
		return true;
	}
}
