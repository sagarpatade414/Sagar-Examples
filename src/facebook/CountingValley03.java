package facebook;

public class CountingValley03 {
	
	static int countingValleys(int n, String s) {
        int countSteps=0;
        int result=0;
        if(s.length() == 0){
            return countSteps;
        }
        char[] chars = s.toCharArray();
        for(int i=0; i<chars.length;i++){
            if(chars[i] == 'U'){
                countSteps+=1;     
            } else if(chars[i] == 'D'){
                countSteps-=1;
            }
            if(i !=0 && countSteps==0 && chars[i] != 'D'){
                result++;
            }
        }

        return result;
    }
	
	public static void main(String[] args) {
		String s = "UDDDUDUU";
		int result = countingValleys(s.length(), s);
		System.out.println("result " + result);
	}
}
