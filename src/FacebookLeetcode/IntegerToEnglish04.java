package FacebookLeetcode;

public class IntegerToEnglish04 {
	
	private final static String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

    private final static String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static String numberToWords(int num) {
        if(num==0){
            return "Zero";
        }
     
        return helper(num);
    }
    
    public static String helper(int num){
        String res="";
        
        if(num<20){
            res = LESS_THAN_20[num];
        } else if(num<100) {
            res = TENS[num/10] + " " + helper(num%10);
        } else if(num<1000) {
            res = helper(num/100) + " Hundred " + helper(num%100);
        } else if(num<1000000) {
            res = helper(num/1000) + " Thousand " + helper(num%1000);
        } else if(num<1000000000) {
            res = helper(num/1000000) + " Million " + helper(num%1000000);
        } else {
            res = helper(num/1000000000) + " Billion " + helper(num%1000000000);
        }
        
        return res.trim();
        
    }
    
    public static void main(String[] main){
    	String numToWord = numberToWords(123);
    	System.out.println("num To Word : " + numToWord);
    }
}	
