package FacebookLeetcode;

public class minWindowSubString {
	
	public static String minWindow(String s, String t) {
	    int [] map = new int[128];
	    for (char c : t.toCharArray()) {
	      map[c]++;
	    }
	    int start = 0, end = 0, minStart = 0, minLen = Integer.MAX_VALUE, counter = t.length();
	    while (end < s.length()) {
	    	System.out.println("counter outside: " + counter); 
	      final char c1 = s.charAt(end);
	      if (map[c1] > 0) counter--;
	      System.out.println(" c1:  " +  c1); 
	      System.out.println(" map[c1] outside 1 : " +  map[c1]); 
	      map[c1]--;
	      System.out.println(" map[c1] outside 2:  " +  map[c1]); 
	      System.out.println("end : " + end);
	      end++;
	      
	      while (counter == 0) {
	    	System.out.println("end : " + end);
	    	System.out.println("start : " + start);  
	        if (minLen > end - start) {
	          minLen = end - start;
	          minStart = start;
	        }
	        System.out.println("minStart : " + minStart);
	    	System.out.println("minLen : " + minLen); 
	    	
	        final char c2 = s.charAt(start);
	        System.out.println("c2 : " + c2); 
	        map[c2]++;
	        System.out.println("map[c2] : " + map[c2]); 
	        if (map[c2] > 0) counter++;
	        System.out.println("counter : " + counter); 
	        start++;
	      }
	    }

	    return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
	}
	
	public static void main(String[] args){
		String S = "DADOBECODEBANC";
		String T = "ABC";
		minWindow(S, T);
	}
	
}	
