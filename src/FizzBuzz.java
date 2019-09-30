import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	
	public static void main(String[] args) {
		List<String> fizzBuzzString = fizzBuzz(100);
		
		System.out.println(fizzBuzzString.toString());
		
	}
	
	public static List<String> fizzBuzz(int n){
		
		List<String> resultString = new ArrayList<>();
		
		for(int n1=1; n1<=n; n1++){
			
			if((n1%3==0) && (n1%5==0)) {
				resultString.add("FizzBuzz");
			} else if(n1%3==0) {
				resultString.add("Fizz");
			} else if(n1%5==0) {
				resultString.add("Buzz");
			}else {
				resultString.add(String.valueOf(n1));
			} 
			
		}
		
		return resultString;
	}
	
}
