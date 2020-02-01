package wayfair;

public class StringCompression {
	
	 public static int compress(char[] chars) {
		
		 int indexRes=0;
		 int index=0;
		 
		 while(index < chars.length) {
			 
			 char curr = chars[index];
			 int count=1;
			 
			 while( index+1 < chars.length && curr == chars[index+1] ){
				 index++;
				 count++;
			 }
			 
			 chars[indexRes++] = curr;
			 index++;
			 if(count == 1) continue;
			 
			 
			 for(char c : String.valueOf(count).toCharArray()) {
				 chars[indexRes++] = c;
			 }
		 }
		 
		 return indexRes;
	 }
	 
	 
	 public static void main(String[] args) {
		 //char[] charArr = {'a','a','b','b','c','c','c'};
		 char[] charArr = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
		 int res = compress(charArr);
		 System.out.print(res);
	 }
}