package facebook;

public class hourGlass09 {
	
	// Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int rows = arr.length;
        int col = arr[0].length;

        int maxSum = -63;

        for(int i=0; i<rows-2; i++){
            for(int j=0; j<col-2; j++){
                int currentMaxSum = arr[i][j] + arr[i][j+1] + arr[i][j+2] 
                                   + arr[i+1][j+1] 
                                   + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                maxSum = Math.max(currentMaxSum, maxSum);
            }
        }

        return maxSum;

    }
    
}
