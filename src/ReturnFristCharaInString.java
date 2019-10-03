
public class ReturnFristCharaInString {
	
	
	public static void main(String[] args) {
		
		
		
		int indexPosition = indexFirstChar("My solution to this is a simple platform that allows", 't'); 
		System.out.print("Index Position :" + indexPosition);
	}
	
	public static int indexFirstChar(String str, char c) {
		
		
		if(str != null && !str.isEmpty()) {
			
			for(int i=0; i<str.length(); i++) {
				
				if(str.charAt(i) == c) {
					return i;
				}
			}
			
		}
		
		
		return -1;
	}
	
}
