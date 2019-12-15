package Random;

public class RemoveEvenIntegers {
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6};
		int[] res = removeEvens(nums);
		
		for(int i :res) {
			System.out.println(i);
		}
	}
	
	public static int[] removeEvens(int[] arr) {
		
		
		if(arr == null || arr.length == 0) {
			return arr;
		}
		
		int oddCounter=0;
		for(int i=0; i<arr.length; i++) {
		  if(arr[i]%2>0) {
			  oddCounter++;
		  }
		}
		
		int[] result = new int[oddCounter];
		
		oddCounter=0;
		for(int i=0; i<arr.length; i++) {
		  if(arr[i]%2>0) {
			  result[oddCounter++] = arr[i];
		  }
		}
		
		
		return result;
	}
}
