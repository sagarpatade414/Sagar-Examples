
public class RobotReturnToOrigin {
	
	public static void main(String[] args) {
		
		boolean judge = judgeCircle("URL");
		System.out.print("Judge : " + judge);
	}
	
	public static boolean judgeCircle(String moves) {
        int UD=0;
        int RL=0;
		
		for(int i=0; i<moves.length(); i++) {
			
			char currentMove = moves.charAt(i); 
			
			
			if(currentMove == 'U') {
				UD++;
			} else if (currentMove == 'D') {
				UD--;
			} else if (currentMove == 'R') {
				RL++;
			} else if (currentMove == 'L') {
				RL--;
			} 
			
		}
        
		
		return UD ==0 && RL==0;
    }
}
