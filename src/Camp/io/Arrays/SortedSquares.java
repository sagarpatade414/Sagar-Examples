package Camp.io.Arrays;

public class SortedSquares {
	
	public static void main(String[] args) {
		
		int[] arr = {-4, -2, -1, 0, 3, 5};
		int[] resultArray = sortedSquares(arr);
		
		for(int item : resultArray) {
			System.out.println(item + "\n");
		}
		
	}
	
	public static int[] sortedSquares(int[] arr) {
		
		int start=0;
		int end=arr.length-1;
		
		int[] res = new int[arr.length];
		int resEnd = res.length;
		
		while(start<end) {
			
			if( arr[start] < 0){
				
				int tmp = (-1)*arr[start];
				
				if(tmp<arr[end]){
					res[--resEnd] = arr[end]*arr[end];
					res[--resEnd] = tmp * tmp;
				} else {
					res[--resEnd] = tmp * tmp;
					res[--resEnd] = arr[end]*arr[end];
				}
			}
			
			start++;
			end--;
		}
		
		return res;
	}
	
}
