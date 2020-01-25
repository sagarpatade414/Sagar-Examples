package facebook;

public class CountAsInString {
	
	// Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        if(s.length() == 0){
            return 0;
        }

        long whole = n/s.length();
        int remainder = (int)(n%s.length());
        int found = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'a'){
                found++;
            }
        }

        long total = whole * found;
        
        if(remainder == 0){
            return total;
        } else {
            
            String remStr = s.substring(0, remainder);
            for(char ch : remStr.toCharArray()){
                if(ch == 'a'){
                    total++;
                }
            }   
              
        }

        return total;

    }
    
    public static void main(String[] args){
        String s = "aba";
        long n = 10;
        long result = repeatedString(s, n);
        
    }
	
	
}
