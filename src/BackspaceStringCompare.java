
public class BackspaceStringCompare {
	
	public static void main(String[] args) {
		
		//String S = "ab#c";
		//String T = "ad#c";
		
		String S = "ab##";
		String T = "c#d#";
		
		Boolean isStringEqual = backspaceCompare(S,T);
		System.out.println("isStringEqual : " + isStringEqual);
	}
	
	public static boolean backspaceCompare(String S, String T) {
		
		StringBuilder sbS = new StringBuilder();
		StringBuilder sbT = new StringBuilder();
		
		for(int i=0; i<S.length(); i++) {
			
			System.out.println("isStringEqual count : " + i);
			System.out.println("isStringEqual S : " + S.charAt(i));
			
			if(S.charAt(i) != '#') {
				sbS.append(S.charAt(i));
			}else {
				System.out.println("sbS.length() : " + sbS.length());
				sbS.deleteCharAt(sbS.length()-1);
			} 
		}
		
		for(int j=0; j<T.length(); j++) {
			
			System.out.println("isStringEqual count : " + j);
			System.out.println("isStringEqual T : " + T.charAt(j));
			
			if(T.charAt(j) != '#') {
				sbT.append(T.charAt(j));
			}else {
				System.out.println("sbT.length() : " + sbT.length());
				sbT.deleteCharAt(sbT.length()-1);
			} 
		}
		
		if( sbS.toString().equals( sbT.toString()) ) {
			return true;
		}
		
		return false;
    }

}
