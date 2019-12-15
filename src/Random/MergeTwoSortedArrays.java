package Random;

import java.util.Arrays;

public class MergeTwoSortedArrays {
	
	
	public static void main(String[] args) {
		
		int[] a = {1,3,5,7,9,11,13};
		int[] b = {2,4,6,8,10};
		
		int[] result =  mergeArrays(a,b);
		
		System.out.println(Arrays.toString(result));
		
	}
	
	public static int[] mergeArrays(int[] a, int[] b) {
		
		
		if(a == null || a.length == 0 && b == null || b.length == 0) {
			return null;
		}
		
		if(a == null || a.length == 0) {
			return b;
		}
		
		if(b == null || b.length == 0) {
			return a;
		}
		
		int mergedLength = a.length + b.length;
		int i=0, j=0, count =0;
		
		int[] mergedArray = new int[mergedLength];
		
		while(i < a.length && j< b.length) {
			if(a[i] < b[j]){
				mergedArray[count++] = a[i++];
			} else {
				mergedArray[count++] = b[j++];
			}
		}
		
		while(i < a.length) {
			mergedArray[count++] = a[i++];
		}
		
		while(j < b.length) {
			mergedArray[count++] = b[j++];
		}
		
		return mergedArray;
	}
}
