
public class TwoDArray {
	
	
	
	public static void main(String[] args) {
	   
		int[][] twoDimensionalArray = {{4, 6, 8, 8}, {77, 6, 8, 8}, {2, 78, 99, 6}};	
		int[][] secondArray = {{9, 0, 92, 8}, {6}, {7, 9, 62}};
		
		System.out.println("First 2D Array : ");
		displayTwoD(twoDimensionalArray);
		
		System.out.println("Second 2D Array : ");
		displayTwoD(secondArray);
	}
	
	
	public static void displayTwoD(int[][] x) {
		
		
		
		for(int row=0; row<x.length; row++) {
			
			for(int col=0; col<x[row].length; col++) {
				System.out.print(x[row][col] +  "\t");
			}
			
			System.out.println("");
			
		}
		
		
		
	} 
}
