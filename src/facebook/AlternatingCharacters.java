package facebook;

public class AlternatingCharacters {
	
	// Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
        int deleteChar=0;
        int i=0;

        while(i<s.length()-1){
            if(s.charAt(i) == s.charAt(i+1)){
                deleteChar++;
            }
            i++;
        }
        
        return deleteChar;

    }
    
    public static void main(String[] args){
        

         String s = "ABABABAB";

         int result = alternatingCharacters(s);
        
    }
}
