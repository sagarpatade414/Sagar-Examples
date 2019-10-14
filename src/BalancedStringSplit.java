
public class BalancedStringSplit {
	
	 public static void main(String[] args) {
		 //String str = "LLLLRRRR";
		 //String str = "RLLLLRRRLR";
		 String str = "RLRRLLRLRL";
		 int balanceStringCount = balancedStringSplit(str);
		 
		 System.out.println("Balance String Count : " + balanceStringCount);
	 }
	 
	 public static int balancedStringSplit(String s) {
	 
		 int count=0;
		 int LR=0;
		 
		 
		 for(int i=0; i<s.length(); i++) {
			 
			 if(s ==null || s.length() == 0) {
				 return 0;
			 }
			 
			 char current = s.charAt(i);
			 
			 if(current == 'L') {
				 LR++;
			 } else if (current == 'R') {
				 LR--;
			 }
			 
			 if(LR == 0) {
				 count++;
			 }
			 
		 }
		 
		 return count; 
	 
	 }
}
