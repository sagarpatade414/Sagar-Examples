package wayfair;

public class RemoveConsecChar {
	
	public static String removeCharac(String s) {
		
		if(s.length() < 3) {
			return s;
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(s.substring(0,2));
		for(int i=2; i<s.length(); i++){
			
			if(s.charAt(i) == s.charAt(i-1) && s.charAt(i) == s.charAt(i-2)){
				
			} else {
				sb.append(s.charAt(i));
			}
		}
		
		
		return sb.toString();
	}
	
	public static void main(String[] args){
		//String s = "eedaaad";
		//String s = "xxxtxxx";
		String s = "uuuuxaaaaxuuu";
		String res = removeCharac(s);
		System.out.println("res :" + res);
		
		String[] ss = "www.cio.com".split("\\.");
		
		for(String s1 :ss) {
			System.out.println("s :" + s1);
		}
	}
}
